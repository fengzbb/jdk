package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.Car;
import com.zbb.jdk.comm.Insurance;
import com.zbb.jdk.comm.Person;

import java.util.Optional;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2018/11/24
 */
public class PersonCarOptionalTest {

    public static void main(String[] args) {

        getNameByOption(new Person());

        // 整合两个optional
        nullSafeFindInsurance(Optional.ofNullable(new Person()), Optional.ofNullable(new Car()));
    }


    private static Optional<Insurance> nullSafeFindInsurance(Optional<Person> person, Optional<Car> car){
        return person.flatMap(p -> car.map(c -> findInsurance(p, c)));
    }

    private static Insurance findInsurance(Person p, Car c) {
        return null;
    }

    /**
     * 以optional 方式获取name， 去除null判断
     * @param person
     */
    private static void getNameByOption(Person person) {
        Optional<Person> personOptional = Optional.ofNullable(person);
        String name = personOptional.flatMap(Person::getCarOptional)
                .flatMap(Car::getInsuranceOptional)
                .map(Insurance::getName)
                .orElse("不存在！");
    }


    /**
     * 找到年龄大于minage的保险公司名字
     * @param person
     * @param minage
     */
    private static void getCarInsuranceName(Optional<Person> person, int minage) {
        String name = person.filter(p -> p.getAge() > minage)
                    .flatMap(Person::getCarOptional)
                    .flatMap(Car::getInsuranceOptional)
                    .map(Insurance::getName)
                    .orElse("不存在！");
    }
}
