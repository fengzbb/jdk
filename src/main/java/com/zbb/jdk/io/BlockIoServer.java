package com.zbb.jdk.io;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Description: 阻塞io server
 * @Author: zbb
 * @Date: 2018/2/26 16:40
 */
public class BlockIoServer {
    public static void main(String[] args) throws Exception{

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 监听8080 进来的tcp链接
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));

        while(true){

            // 阻塞 直到有一个请求的连接进来
            SocketChannel socketChannel = serverSocketChannel.accept();

            // 开启一个新的线程来处理这个请求，然后在 while 循环中继续监听 8080 端口
            BlockSocketHandler blockSocketHandler = new BlockSocketHandler(socketChannel);

            new Thread(blockSocketHandler).start();
        }

    }
}
