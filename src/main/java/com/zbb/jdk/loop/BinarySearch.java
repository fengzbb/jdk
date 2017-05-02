package com.zbb.jdk.loop;

/**
 * 二分查找法
 * @Description:
 * @author zbb
 * @date 2017年5月2日 下午4:16:10
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,8,15,30,35,40,46,54,70,98};
		int i = binary(arr, 12);
		System.out.println(i == -1 ? "此数不在此数组。。。" : "此数在数组的"+ (i+1) + "位");
	}
	public static int binary(int[] arr,int num){
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end)/2;
		while(end >= start){
			if(arr[mid] == num){
				return mid;
			}else if(arr[mid] > num){
				end = mid - 1;
				mid = (start + end)/2;
			}else{
				start = mid + 1;
				mid = (start + end)/2;
			}
		}
		return -1;
	}
}
