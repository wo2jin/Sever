package com.test;
class Student5{
	String name;
	int age;
	public Student5(String name, int age) { //�����ڰ� ����������� ��ӹ޴� Ŭ�������� 
	this.name = name;
	this.age = age;
	}
}
class HighStudent5 extends Student5{
	int grade;
	public HighStudent5(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
//	void seNameAge(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	void study() {
		System.out.println(name+","+age+","+grade);
	}
}

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighStudent5 stu = new HighStudent5("ȫ�浿",20,1);
		stu.study();
		}

}
