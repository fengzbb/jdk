package com.zbb.jdk.callback;

public class Teacher implements CallBack {
	
	private Student student;
	
	public Teacher(Student student){
		this.student = student;
	}
	
	//������
	public void askAnswer(){
		student.resolving(this);
	}

	@Override
	public void tellAnswer() {
		System.out.println("����OK������������222");
	}

}
