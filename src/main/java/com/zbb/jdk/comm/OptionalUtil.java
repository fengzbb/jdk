package com.zbb.jdk.comm;


import java.util.Optional;

/**
 * 描述：
 *  optional工具类
 * @author bbzhou
 * @created 2018/11/24
 */
public class OptionalUtil {

//    private static final Logger logger =

    /**
     * 将String 转化为 Integer
     * @param str
     * @return
     */
    public static Optional<Integer> stringToInt(String str){
        Optional<Integer> integer = null;
        try {
            integer = Optional.of(Integer.parseInt(str));
        } catch (Exception e) {
            integer = Optional.empty();
            e.printStackTrace();
        }
        return integer;
    }
}
