package com.zbb.jdk.thread;

/**
 * @author 46409
 * @desc 线程
 * @date 2020/05/07
 */
public class ThreadDemo {

    public static void main(String[] args) {
        // yield 让出cpu执行权，其他等待线程能否抢到执行权不一定
//        testYield();

        // 让出cpu执行权，等待join线程执行完之后，在执行本线程
        testJoin();

    }

    private static void testJoin() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("a-------" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 20; i++) {
                System.out.println("b-------" + i);
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0) {
                    System.out.println("a---------" + i);
                    Thread.yield();
                }
            }
        }).start();

        new Thread(() -> {
            for (int j = 0; j < 100; j++) {
                if (j % 10 == 0) {
                    System.out.println("b---------" + j);
                    Thread.yield();
                }
            }
        }).start();
    }
}
