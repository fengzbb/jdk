package com.zbb.jdk.comm;

import java.io.Serializable;

/**
 * 描述：
 *    User 用户类
 * @author bbzhou
 * @created 2018/11/24
 */
public class User implements Serializable {

    // 没有的话会有默认，版本号，不一致无法正常反序列化
    private static final long serialVersionUID = -8332426165375356364L;
    // id
    private Long id;

    // 姓名
    private String name;

    private Integer age;

    // 昵称
    private String nickName;

    // 密码
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
