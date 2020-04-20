package com.test;

class A{
	int aValue;
	public A() {//static���� ������ �������� ���� / class�� ȣ��Ǵ� �⺻���� ���Ǵ°��̶�
		System.out.println("Default Constructor A");
		this.aValue =10;
	}
	public A(int aValue) {//super�� �޴� ���� �޼ҵ�
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class B extends A{
	int bValue;
	public B() {
		System.out.println("Default Constructor B");
		this.bValue =100;
	}
	public B(int bValue) {
		super(bValue);//������ �������̵� �� �޼ҵ� public A(int aValue)���� �밪�� ����
		this.bValue = bValue;
		System.out.println("Constructor B"+bValue+","+this.aValue);
	}
}

public class Test6 {
	public static void main(String[] args) {
//		A a = new A();
		B b = new B(100);//����Ŭ������ ���� �����ǰ� ����Ŭ������ �����ȴ�.
	
	}
}
