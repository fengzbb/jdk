package com.zbb.jdk.collection;

import java.util.Arrays;

//out[3, 4, 1, 1, 1, 1, 1, 1, 1]
public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] tar = {1,1,1,1,1,1,1,1,1};
		System.arraycopy(arr, 2, tar, 0, 2);
		System.out.println(Arrays.toString(tar));
	}
}
