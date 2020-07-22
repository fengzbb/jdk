package com.zbb.jdk.io.bio;

import com.zbb.jdk.comm.User;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SerServer {

    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8080);

        Socket accept = socket.accept();

        ObjectInputStream inputStream = new ObjectInputStream(accept.getInputStream());

        User user = (User)inputStream.readObject();

        System.out.println(user);
    }
}
