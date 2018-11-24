package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.User;

import java.util.Optional;

/**
 * 描述：
 *  Filter方法
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalFilter {

    private final static String NAME = "xiao";

    public static void main(String[] args) {
        Optional<User> userOptional = Optional.ofNullable(new User("xiao", "123456"));

        //optional中的值符合条件，则返回该optional对象，否则返回空的optional对象
        User user = userOptional.filter(u -> NAME.equals(u.getName())).orElse(new User("不满足", ""));
        System.out.println("name=" + user.getName()); //name=xiao

    }
}
