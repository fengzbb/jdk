package com.zbb.jdk.thread;

public class BasicThread {
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.println("waiting for liftoff!");
	}
}
