package com.zbb.jdk.callback;

public class Tom implements Student {

	@Override
	public void resolving(CallBack c) {
		System.out.println("�������⣬����");
		System.out.println("�ص����⡣������������������");
		c.tellAnswer();
	}

}
