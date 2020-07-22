package com.zbb.jdk.io.bio;

import com.zbb.jdk.comm.User;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SerClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8080);

        User user = new User();
        user.setName("xiaohong");
        user.setAge(10);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeObject(user);
        outputStream.close();

    }
}
