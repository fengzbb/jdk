package com.zbb.jdk.loop;

/**
 * ���ֲ��ҷ�
 * @Description:
 * @author zbb
 * @date 2017��5��2�� ����4:16:10
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,8,15,30,35,40,46,54,70,98};
		int i = binary(arr, 12);
		System.out.println(i == -1 ? "�������ڴ����顣����" : "�����������"+ (i+1) + "λ");
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
