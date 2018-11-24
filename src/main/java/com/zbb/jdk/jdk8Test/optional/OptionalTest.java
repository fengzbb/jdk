package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.User;

import java.util.Optional;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalTest {

    public static void main(String[] args) {
        // First before jdk8
        Long id = 0L;
        firstBeforeJdk8(id);

        User userById = Optional.ofNullable(getUserById(id)).orElse(new User());
        String name = userById.getName();
        System.out.println("new name=" + name);
    }
    private static void firstBeforeJdk8(Long id) {
        User user = getUserById(id);
        if (user != null) {
            String name = user.getName();
            System.out.println("name=" + name);
        }
    }

    private static User getUserById(Long id) {
        return null;
    }
}
