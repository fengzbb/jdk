package com.zbb.jdk.io.netty;

import com.zbb.jdk.io.handler.RequestHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NioServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);
        serverChannel.bind(new InetSocketAddress(9999));

        System.out.println(String.format("Nio Server start, port:%s", serverChannel.getLocalAddress()));

        Selector selector = Selector.open();

        serverChannel.register(selector, SelectionKey.OP_ACCEPT);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        RequestHandler requestHandler = new RequestHandler();

        while (true) {
            if(selector.select() == 0) continue;

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            // SelectionKey 拿到一个， 代表就是channel
            while (iterator.hasNext()){
                // 表示客户端已经连接成功
                SelectionKey key = iterator.next();
                if(key.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel clientChannel = channel.accept();
                    System.out.println("connect from " + clientChannel.getRemoteAddress());
                    clientChannel.configureBlocking(false);
                    // channel 需要进行数据的读写， 就需要修改状态
                    clientChannel.register(selector, SelectionKey.OP_READ);
                }
                if(key.isReadable()){
                    SocketChannel channel = (SocketChannel)key.channel();
                    channel.read(buffer);
                    String request = new String(buffer.array()).trim();
                    buffer.clear();
                    System.out.println(String.format("1111from :%s: %s", channel.getRemoteAddress(), request));
                    String handle = requestHandler.handle(request);
                    channel.write(ByteBuffer.wrap(handle.getBytes()));
                }
                iterator.remove();
            }
        }
    }
}
