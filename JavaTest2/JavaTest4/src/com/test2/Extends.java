package com.test2;


class one{
	int aValue;
	public one() {//static���� ������ �������� ���� / class�� ȣ��Ǵ� �⺻���� ���Ǵ°��̶�
		System.out.println("Default Constructor A");
		this.aValue =10;
	}
	public one(int aValue) {//super�� �޴� ���� �޼ҵ�
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class two extends one{
	int bValue;
	public two() {
		System.out.println("Default Constructor B");
		this.bValue =100;
	}
	public two(int bValue) {
		super(7);//������ �������̵� �� �޼ҵ� public A(int aValue)���� �밪�� ����
		this.bValue = bValue;
		System.out.println("Constructor B"+bValue+","+this.aValue);
	}
}
public class Extends {
	public static void main(String[] args) {
//		one a = new one();
		two b = new two(100);//����Ŭ������ ���� �����ǰ� ����Ŭ������ �����ȴ�.
	}

}
