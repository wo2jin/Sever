package com.test3;
class School{
	String name;
	int age;
	public School() {}
	public School(String aheight) {
		System.out.println("�б� ����");
	}
	void getInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name+","+this.age+"�л��Դϴ�.");
	}

	
}
class MiddleSchool extends School{
	String grade;
	public MiddleSchool() {}
//	public MiddleSchool(String bheight){ //����Ʈ �����ڰ� �־������ ���� �ֳ�??
//		System.out.println("�б� ����");
//	}
	void getInfo(String name, int age,String grade) {
		super.name = name;
		super.age = age;
		this.grade = grade;
		System.out.println(this.grade+","+super.name+","+super.age+"����л��Դϴ�.");
	}
}
class highSchool extends MiddleSchool{
	
	public highSchool(String cheight) {
		
	}	
}

public class Student {
	public static void main(String[] args) {
		MiddleSchool sc = new MiddleSchool();
		sc.getInfo("������",20,"�ٺ�");
		School sc2 = sc;
		
		sc2.getInfo(sc.name,sc.age);
				
	
		
	}
}
