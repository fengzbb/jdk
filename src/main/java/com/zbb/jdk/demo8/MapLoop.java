package com.zbb.jdk.demo8;

import java.util.HashMap;
import java.util.Map;

/**
 * jdk8 map的循环方式
 */
public class MapLoop {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("xiaohong", "11");
        map.put("xiaoming", "22");

        // 循环，key,value
        map.forEach((k, v) -> {
            doSomething(k,v);
        });

        // 循环map中的values
        map.values().forEach(System.out :: println);

        // Map.entrySet来遍历key,value, 大容量时推荐使用
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        // 使用iterator来遍历Map.entrySet
        map.entrySet().iterator().forEachRemaining(iter -> {
            System.out.println(iter.getKey());
            System.out.println(iter.getValue());
        });

        // 遍历key
        map.keySet().forEach(key -> {
            System.out.println(key);
            System.out.println(map.get(key));
        });
    }

    private static void doSomething(String k, String v) {}
}
