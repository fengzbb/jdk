package com.zbb.jdk.jdk8Test.thread;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2019/3/14
 */
public class ThreadInterruptDemo {

    public static void main(String[] args) {
        try{
            Thread thread = new Thread();
            Thread.sleep(1100);
            thread.isInterrupted();
            System.out.println(thread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("error "+ e.getMessage());
        }
    }
}
