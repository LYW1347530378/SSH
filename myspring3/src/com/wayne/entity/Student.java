package com.wayne.entity;

public class Student {
	private String name;
	
	//Java��Ĭ�϶���һ���޲εĹ��캯��
	public Student(){
		System.out.println("Student������");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
