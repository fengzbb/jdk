package com.zbb.jdk.optional;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: zbb
 * @Date: 2018/1/24 11:12
 */
public class Person {

    // name
    private String name;

    // age
    private Integer age;

    private BigDecimal m;
    // address
    private String address;

    public BigDecimal getM() {
        return m;
    }

    public void setM(BigDecimal m) {
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
