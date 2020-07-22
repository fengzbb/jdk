package com.zbb.jdk.io.serializable;

import com.zbb.jdk.comm.User;

public class SerializableDemo {

    public static void main(String[] args) {
//        ISerializable serializable = new JdkSerializable();
        ISerializable serializable = new XStreamSerializable();

        User user = new User();
        user.setName("xiaohong");
        user.setAge(10);
        byte[] data = serializable.serializable(user);
        System.out.println(new String(data));
        System.out.println(data.length);
        System.out.println(serializable.deSerializable(data, User.class));
    }
}
