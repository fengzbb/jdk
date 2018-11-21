package com.zbb.jdk.callback;

public class Tom implements Student {

	@Override
	public void resolving(CallBack c) {
		System.out.println("处理问题，，，");
		System.out.println("回调问题。。。。。。。。。。");
		c.tellAnswer();
	}

}
