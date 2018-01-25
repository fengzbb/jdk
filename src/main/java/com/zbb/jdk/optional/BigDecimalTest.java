package com.zbb.jdk.optional;

import java.math.BigDecimal;

/**
 * @Description: BigDecimal的基本运算
 * @Author: zbb
 * @Date: 2018/1/25 19:28
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(10);
        BigDecimal b = BigDecimal.valueOf(2);
        BigDecimal add = add(a, b);
        BigDecimal sub = sub(a, b);
        BigDecimal mul = mul(a, b);
        BigDecimal div = div(a, b);
        System.out.println(add + "-" + sub + "-" + mul + "-" + div);
    }

    /**
     * a,b 相加
     * @param a
     * @param b
     * @return
     */
    private static BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    /**
     * a,b 相减
     * @param a
     * @param b
     * @return
     */
    private static BigDecimal sub(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    /**
     * a,b相乘
     * @param a
     * @param b
     * @return
     */
    private static BigDecimal mul(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    /**
     * 保留两位小数，最后一位四舍五入
     * a,b 想除
     * @param a
     * @param b
     * @return
     */
    private static BigDecimal div(BigDecimal a, BigDecimal b){
        return a.divide(b).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
