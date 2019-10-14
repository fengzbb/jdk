package com.zbb.jdk.datastructure;

/**
 * 描述：数组
 *
 * @author: 46409
 * @created 2019/10/5
 */
public class MyArrayDemo {

    private Integer size;

    private int[] array;

    public MyArrayDemo(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    public void insert(int index, int element) throws Exception {
        //数组的实际元素可能小于数组长度
        if (index < 0 || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("超出数组范围!");
        }
        if (size >= array.length) resize();
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    private void resize() {
        int[] newArray = new int[2 * array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int delete(int index) throws Exception {
        if (index < 0 || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("超过数组范围！");
        }
        int element = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1] = 0;
        size--;
        return element;
    }

    public void outprint() {
        StringBuffer sb = new StringBuffer();
        for (int i : this.array) {
            sb.append(i).append("-");
        }
        if(sb.toString().length() != 0) System.out.println(sb.toString().substring(0, sb.toString().lastIndexOf("-")));
    }

    public static void main(String[] args) throws Exception {
        MyArrayDemo myArrayDemo = new MyArrayDemo(6);
        myArrayDemo.insert(0, 1);
        myArrayDemo.insert(1, 9);
//        myArrayDemo.insert(2, 10);
//        myArrayDemo.insert(5, 13);
//        myArrayDemo.insert(3, 11);
        myArrayDemo.insert(0, 8);
        myArrayDemo.insert(0, 8);
        myArrayDemo.outprint();
//        myArrayDemo.delete(4);
//        myArrayDemo.outprint();

    }


}
