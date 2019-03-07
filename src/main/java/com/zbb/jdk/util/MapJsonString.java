package com.zbb.jdk.util;

import java.util.Map;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2019/3/7
 */
public class MapJsonString {

    public static String mapToString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> {
            sb.append(String.format("key:%s,value:%s", k, v)).append(";");
        });
        String str = "";
        if(sb.length() > 0) str = sb.toString().substring(0, sb.toString().lastIndexOf(";"));
        return str;
    }
}
