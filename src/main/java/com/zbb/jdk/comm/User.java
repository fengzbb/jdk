package com.zbb.jdk.comm;

/**
 * 描述：
 *    User 用户类
 * @author bbzhou
 * @created 2018/11/24
 */
public class User {

    // id
    private Long id;

    // 姓名
    private String name;

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
}
