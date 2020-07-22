package com.zbb.jdk.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author feng
 * @date 2020/06/23
 * @desc bio
 */
public class BIOServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println(String.format("BIO SERVER start, port:%s", serverSocket.getLocalSocketAddress()));
            // 不断监听客户端请求
            A:while (true) {
                // 拿到客户端
                Socket clientSocket = serverSocket.accept();
                System.out.println(String.format("client from:%s", clientSocket.getRemoteSocketAddress()));
                Scanner input = new Scanner(clientSocket.getInputStream());
                // socket 进行数据交互
                while (true) {
                    String request = input.nextLine();
                    if ("quit".equals(request)) {
                        break A;
                    }
                    System.out.println(String.format("from :%s, request:%s", clientSocket.getRemoteSocketAddress(), request));
                    String response = "from server: " + request + ".\n";
                    clientSocket.getOutputStream().write(response.getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
