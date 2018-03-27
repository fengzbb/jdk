package com.zbb.jdk.io;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description: 非阻塞 io server
 * @Author: zbb
 * @Date: 2018/2/26 17:36
 */
public class SelectorServer {

    public static void main(String[] args) throws Exception{

        Selector selector = Selector.open();
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(8080));

        // 将其注册到 Selector 中，监听 OP_ACCEPT 事件
        server.configureBlocking(false);
        server.register(selector, SelectionKey.OP_ACCEPT);
        while(true){
            // 需要不断地去调用 select() 方法获取最新的准备好的通道
            int readyChannels = selector.select();
            if(readyChannels == 0){
                continue;
            }
            Set<SelectionKey> readyKeys = selector.selectedKeys();
            System.out.println(readyKeys.size()+"--------------");
            // 遍历
            Iterator<SelectionKey> iterator = readyKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
//                iterator.remove();
                if (key.isAcceptable()) {
                    // 有已经接受的新的到服务端的连接
                    SocketChannel socketChannel = server.accept();

                    // 有新的连接并不代表这个通道就有数据，
                    // 这里将这个新的 SocketChannel 注册到 Selector，监听 OP_READ 事件，等待数据
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    // 有数据可读
                    // 上面一个 if 分支中注册了监听 OP_READ 事件的 SocketChannel
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                    int num = socketChannel.read(readBuffer);
                    if (num > 0) {
                        // 处理进来的数据...
                        System.out.println("收到数据：" + new String(readBuffer.array()).trim());
                        socketChannel.register(selector, SelectionKey.OP_WRITE);
                        System.out.println("1111111111111111");
                    } else if (num == -1) {
                        // -1 代表连接已经关闭
                        socketChannel.close();
                    }
                    System.out.println("222222222222");
                }else if (key.isWritable()) {
                    // 通道可写
                    // 给用户返回数据的通道可以进行写操作了
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.wrap("返回给客户端的数据...".getBytes());
                    socketChannel.write(buffer);

                    // 重新注册这个通道，监听 OP_READ 事件，客户端还可以继续发送内容过来
                    socketChannel.register(selector, SelectionKey.OP_READ);
                }
                System.out.println("3333333333333333");
            }
        }


    }

}
