package com.zbb.jdk.sort;

import java.util.Arrays;

/**
 * @Description: 快速排序
 * @Author: zbb
 * @Date: 2018/3/26 15:42
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {33,8,6,41,52,31,21,11,12};
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int height){
        if(low >= height){
            return ;
        }
        int index = getIndex(arr, low, height);

        quickSort(arr, low, index-1);
        quickSort(arr, index+1, height);
    }

    private static int getIndex(int[] arr, int low, int height) {
        int temp;
        int key = arr[low];
        while(low < height){
            while(key <= arr[height] && low < height){
                height --;
            }
            temp = arr[low];
            arr[low] = arr[height];
            arr[height] = temp;
            while(arr[low] <= key && low < height){
                low ++;
            }
            temp = arr[low];
            arr[low] = arr[height];
            arr[height] = temp;
        }
        System.out.println("low---"+arr[low]);
        return low;
    }

    /*private static int sortdemo(int[] arr, int low, int height) {
        int key = arr[low];
        System.out.println(key+"-------key------");
        while(low < height){
            while(key <= arr[height] && low < height){
                height --;
            }
            arr[low] = arr[height];
            while(arr[low] <= key && low < height){
                low ++;
            }
            arr[height] = arr[low];
            System.out.println("arr[low]---"+arr[low]+"--arr[height]--"+arr[height]+"--key---"+key);
            System.out.println("arr--"+Arrays.toString(arr));
        }
        arr[height] = key;
        System.out.println(arr[height]+"--------arr[height]-----");
        return height;
    }*/
}
