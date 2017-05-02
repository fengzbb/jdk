package com.zbb.jdk.loop;

/**
 * 递归菲波那切数列
 * @Description:
 * @author zbb
 * @date 2017年5月2日 下午4:16:27
 */
public class RecurrenceFibonacciDemo {
	public static void main(String[] args) {
		System.out.println(fibonacci(8));
	}
	
	public static int fibonacci(int num){
		int result = 0 ;
		if(num < 1){
			System.out.println("wu xiao can shu");
			result = -1;
 		}else if(num <= 2){
			result = 1;
		}else{
			result = fibonacci(num-1) + fibonacci(num-2);
		}
		return result;
	}
}
