package com.zbb.jdk.util;

/**
 * @desc: 断言
 * @author feng
 * @date 2020/04/17
 */
public class Assert {

    /**
     * bool值
     * @param flag
     */
    public static void assertTrue(boolean flag){
        assert flag : "失败";
    }

    /**
     * bool值
     * @param flag
     */
    public static void assertFalse(boolean flag){
        assert !flag : "成功";
    }

    /**
     * 两值是否相等
     * @param t
     * @param e
     * @param <T>
     * @param <E>
     */
    public static <T, E> void assertEquals(T t, E e){
        assert  t == e : "错误,值不相等";
    }
}
