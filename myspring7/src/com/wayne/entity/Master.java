package com.wayne.entity;

public class Master {
	private String name;
	private Dog dog;

	public Master(Dog dog){
		System.out.println("������master�Ĺ��캯��");
		this.dog = dog;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
