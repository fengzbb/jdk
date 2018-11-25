package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.User;

import java.util.Optional;

/**
 * 描述：
 * 构建optional 方法
 *
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalOfTest {

    public static void main(String[] args) {

        // empty 构建空的optional对象
        Optional<Object> empty = Optional.empty();

        // of 构造user的optional 对象，user对象不为空， 如果为空，构建的时候就会报nullPointerException
        User user = new User();
        Optional<User> userOptional = Optional.of(user);

        // ofNull 构造optional对象，内部user如果为空，就构建空的optional对象
        Optional<User> userOptionalOfNull = Optional.ofNullable(user);

        System.out.println("empty" + empty);
        System.out.println("userOptional" + userOptional);
        System.out.println("userOptionalOfNull" + userOptionalOfNull);

        Optional<Object> objectOptional = Optional.of(null);
        System.out.println(objectOptional);
    }

}
