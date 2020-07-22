package com.zbb.jdk.io.handler;

import com.zbb.jdk.io.handler.ClientHandler;
import com.zbb.jdk.io.handler.RequestHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioServerThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println(String.format("BIO SERVER start, port:%s", serverSocket.getLocalSocketAddress()));

            RequestHandler requestHandler = new RequestHandler();
            // 不断监听客户端请求
            while (true) {
                // 拿到客户端
                Socket clientSocket = serverSocket.accept();
                System.out.println(String.format("client from:%s", clientSocket.getRemoteSocketAddress()));
                executorService.submit(new ClientHandler(clientSocket, new RequestHandler()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
