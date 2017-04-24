package com.zbb.jdk.callback;

public class CallBackTest {
	public static void main(String[] args) {
		Student s = new Tom();
		Teacher t = new Teacher(s);
		t.askAnswer();
	}
	
}
