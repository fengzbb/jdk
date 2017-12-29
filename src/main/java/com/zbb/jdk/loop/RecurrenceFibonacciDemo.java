package com.zbb.jdk.loop;


/**
* @Description: 斐波那契数列
* @Author: zbb
* @Date: 2017/12/28 18:09
*/
public class RecurrenceFibonacciDemo {
	public static void main(String[] args) {
		System.out.println(fibonacci(20));
		System.out.println(fibonacciLoop(20));
	}

	// 递归
	public static int fibonacci(int num){
		if(num < 0){
			System.out.println("wu xiao can shu");
			return -1;
 		}else if(num < 2){
			return num;
		}else{
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}

	// 循环迭代
	public static int fibonacciLoop(int num){
		int F1=0, F2=1, F3=0;
		if(num <= 1) return num;
		for (int i = 0; i < num-1; i++) {
			 F3 = F1 + F2;
			 F1 = F2;
			 F2 = F3;
		}
		return F3;
	}
}
