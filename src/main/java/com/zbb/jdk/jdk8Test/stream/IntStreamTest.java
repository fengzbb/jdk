package com.zbb.jdk.jdk8Test.stream;

import com.zbb.jdk.util.Assert;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * 数值流 IntStream
 * @author feng
 * @date 2020/04/21
 */
public class IntStreamTest {

    public static void main(String[] args) {
//        IntStream limit = IntStream.generate(() -> 1).limit(10);
//        int sum = limit.sum();
//        Assert.assertEquals(10, sum);

//        int sum = IntStream.range(1, 10).sum();//range 包头不包尾
//        Assert.assertEquals(45, sum);
//        int sum = IntStream.rangeClosed(1, 10).sum();//rangeClosed 包头包尾
//        Assert.assertEquals(55, sum);

//        IntStream.iterate(1, (i) -> 1 +3).limit(5).forEach(System.out::print);

//        IntStream.of(1, 2, 3).flatMap(e -> IntStream.rangeClosed(0, e)).forEach(System.out::println);
//        IntStream.rangeClosed(1, 100).boxed().flatMap(a ->
//                IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
//                .mapToObj(b -> new int[]{a, b, (int)Math.sqrt(a*a + b*b) })).forEach(l -> {
//                    IntStream.of(l).mapToObj(o -> String.format("%s,", o)).forEach(System.out::print);
//                    System.out.println();
//                });

//        IntStream.of(1, 2, 3, 4, 5)
//                .filter(e -> e >= 3)
//                .peek(value -> System.out.printf("filter element: %d\n", value))
//                .mapToObj(String::valueOf)
//                .forEach(System.out::println);

        // 需要提供容器工厂、元素收集器、容器组合器
//        ArrayList<Integer> list = IntStream.range(0, 100).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        Assert.assertEquals(100,list.size());

        IntSummaryStatistics summaryStatistics = IntStream.of(-2, 2, -9, 10, 9).summaryStatistics();
        long count = summaryStatistics.getCount();
        int max = summaryStatistics.getMax();
        int min = summaryStatistics.getMin();
        long sum = summaryStatistics.getSum();
        double average = summaryStatistics.getAverage();
        System.out.println();
    }


}
