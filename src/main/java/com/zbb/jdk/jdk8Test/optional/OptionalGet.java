package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.User;

import java.util.Optional;

/**
 * 描述：
 *  get  isPresent 方法
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalGet {

    public static void main(String[] args) {

        Long id = 0L;


        Optional<User> userOptional = Optional.ofNullable(getUserById(id));
        // isPresent  判断optional对象是否存在，如果存在，返回true, 否则返回false
        if(userOptional.isPresent()){
            // 已判断存在
            // get 如果创建的Optional中有值存在，则返回此值，否则抛出NoSuchElementException
            User user = userOptional.get();
            System.out.println("name" + user.getName());
        }

        // 创建的Optional中的值存在，则执行该方法的调用，否则什么也不做
        // ifPresent方法的参数是一个函数式接口， 该方法无返回值，可以直接用lambda表达式
        userOptional.ifPresent(user -> System.out.println("name=" + user.getName()));


    }

    private static User getUserById(Long id) {
        return null;
    }
}
