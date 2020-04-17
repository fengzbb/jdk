package com.zbb.jdk.datastructure;

/**
 * 循环队列
 * @author feng
 * @date 2020/04/17
 */
public class MyCircularQueue {

    private int front;

    private int rear;

    private int[] array;

    public MyCircularQueue(int length) {
        array = new int[length];
    }

    // 入队
    public void enQueue(int element) throws Exception{
        if((rear + 1)% array.length == front) {
            throw new Exception("队列已满!");
        }
        array[rear] = element;
        rear += 1;
    }

    // 出队
    public int deQueue() throws Exception{
        if(front == rear) {
            throw new Exception("队列已空!");
        }
        int i = array[front];
        System.out.println("出列的是"+i);
        front = front + 1;
        return i;
    }

    public void outprint(){
        for (int i=front; i!=rear; i=(i+1)%array.length) {
            System.out.print(array[i] + ",");
        }
    }

    public static void main(String[] args) throws Exception{
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        myCircularQueue.enQueue(5);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(2);
        myCircularQueue.outprint();
        myCircularQueue.deQueue();
        myCircularQueue.outprint();
        myCircularQueue.deQueue();
        myCircularQueue.outprint();
        myCircularQueue.deQueue();
        myCircularQueue.outprint();
        myCircularQueue.deQueue();
        myCircularQueue.outprint();
    }
}
