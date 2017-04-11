package com.zbb.jdk.thread;

public class LiftOff implements Runnable{
	
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		while(countDown-- > 0){
			System.out.print(status());
			Thread.yield();
		}
		
	}
	private String status() {
		return "#" + "i=" +id + "(cd=" + (countDown>0?countDown:"Liftoff!") +"), ";
	}

}
