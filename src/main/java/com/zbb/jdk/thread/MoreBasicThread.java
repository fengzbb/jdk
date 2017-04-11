package com.zbb.jdk.thread;

public class MoreBasicThread {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			new Thread(new LiftOff()).start();
	}
}
