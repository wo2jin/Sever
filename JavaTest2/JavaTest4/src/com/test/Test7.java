package com.test;
class Student3{
	String name;
	public Student3(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}

class MiddleStudent3 extends Student3{
	int age;

	public MiddleStudent3(String name,int age) {
//		this.name = name;
		super("ȫ�浿");
		this.age = age;
		System.out.println(name+","+age);
	}
}

public class Test7 {
	public static void main(String[] args) {
		MiddleStudent3 md = new MiddleStudent3("�̼���",30);
		
	}

}
