package com.zbb.jdk.callback;

public class Teacher implements CallBack {
	
	private Student student;
	
	public Teacher(Student student){
		this.student = student;
	}
	
	//问问题
	public void askAnswer(){
		student.resolving(this);
	}

	@Override
	public void tellAnswer() {
		System.out.println("处理OK。。。。答案是222");
	}

}
