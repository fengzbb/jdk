package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.User;

import java.util.Optional;

/**
 * 描述：
 *     orelse 方法
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalOrElse {

    public static void main(String[] args) throws Exception{
        Long id = 0L;

        Optional<User> userOptional = Optional.ofNullable(getUserById(id));

        //orElse 如果optional 有值就返回值，如果没有就返回一个默认值
        // 默认值就是我们创建的一个类
        User user = userOptional.orElse(new User("xiaohong", "123456789"));
        System.out.println("name=" + user.getName()); // name=xiaohong

        //orElseGet 如果optional有值就返回值，如果没有，就执行一个Supplier接口，返回生成的值
        User userOrElseGet = userOptional.orElseGet(() -> new User("xiaohongGet", "123456789"));
        System.out.println("name=" + userOrElseGet.getName()); //name=xiaohongGet

        //orElseThrow 如果optional有值就返回值，如果没有，就返回一个指定的Supplier接口生成的异常
        User userElseThrow = userOptional.orElseThrow(() -> new Exception("userOptional 为空！"));



    }

    private static User getUserById(Long id) {
        return null;
    }
}
