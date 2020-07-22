package com.zbb.jdk.io.handler;

import com.zbb.jdk.io.handler.RequestHandler;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Socket clientSocket;

    private RequestHandler requestHandler;

    public ClientHandler(Socket socket, RequestHandler requestHandler) {
        this.clientSocket = socket;
        this.requestHandler = requestHandler;
    }

    @Override
    public void run() {
        Scanner input = null;
        try {
            input = new Scanner(clientSocket.getInputStream());
            // socket 进行数据交互
            while (true) {
                String request = input.nextLine();
                if ("quit".equals(request)) {
                    break;
                }
                System.out.println(String.format("from :%s, request:%s", clientSocket.getRemoteSocketAddress(), request));
                String handle = requestHandler.handle(request);
                clientSocket.getOutputStream().write(handle.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
