package com.zbb.jdk.jdk8Test.map;

import com.zbb.jdk.util.MapJsonString;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *  map的 compute，computeIfAbsent，computeIfPresent,putIfAbsent
 * @author bbzhou
 * @created 2019/3/5
 */
public class MapPutDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        /*for (int i=1; i<3; i++) {
            map.compute(String.valueOf(i), (k, v) -> {
                if (null == v) return "0";
                return v + 1;
            });
        }*/
        // key:1,value:a1;key:2,value:0
        // compute  不管key 值是否存在都会执行后面函数  并保存
        System.out.println(MapJsonString.mapToString(map));

//        System.out.println("2222222222222222");
        //computeifabsent
        //key 存在 返回当前value   不存在 执行后面函数
        // key:1,value:a;key:2,value:2
        /*for (int i=1; i<3; i++) {
            map.computeIfAbsent(String.valueOf(i), k -> {
                return k;
            });
        }
*/


        //computeIfPresent
        // key 存在执行后面函数， 不存在不执行函数
        /*System.out.println("33333333333333");
        for (int i=1; i<3; i++) {
            map.computeIfPresent(String.valueOf(i), (k, v) -> {
                return k;
            });
        }*/
        //key:1,value:1



        // putIfAbsent  key存在，不于操作，  key 不存在， 添加
        for (int i=1; i<3; i++) {
            map.putIfAbsent(String.valueOf(i), "" +i);
        }
        System.out.println(MapJsonString.mapToString(map));
    }
}
