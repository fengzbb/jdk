package com.zbb.jdk.comm;

import java.util.Optional;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2018/11/24
 */
public class Person {

    // 车
    private Car car;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Optional<Car> getCarOptional(){
        return Optional.ofNullable(car);
    }
}
