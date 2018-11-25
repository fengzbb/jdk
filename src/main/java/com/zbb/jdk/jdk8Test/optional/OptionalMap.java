package com.zbb.jdk.jdk8Test.optional;

import java.util.Optional;

/**
 * 描述：
 *    map flatMap
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalMap {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("zhang,san");

        //map  optional对象存在就执行Funciton函数
        // 可以返回任意类型的值
        // 该函数式接口对optional对象中的值进行修改，返回修改后的值
        Optional<String[]> optionalMap = optional.map(s -> s.split(",")); //Optional[[Ljava.lang.String;@19dfb72a]

        // flatMap方法中的lambda表达式返回值必须是Optionl实例
        Optional<String> optionalFlatMap = optional.flatMap(s -> Optional.of("lisi"));//Optional[lisi]

        System.out.println(optionalMap);
        System.out.println(optionalFlatMap);
    }
}
