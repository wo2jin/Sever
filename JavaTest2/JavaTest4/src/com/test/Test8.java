package com.test;
class MyClass{
	static int count;//static�� ���� ��� �Ʒ� ȣ�⿡ ���� count�� ���� �Ǳ� ������ ����ؼ� �þ��.
	public MyClass() {
		count++;
		System.out.println(count);
	}
	
}

public class Test8 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();// m1,m2,m3,m4�� ���δٸ� ��ü������ static �� ���� int count�� �����Ҽ� �ִ�.
		MyClass m2 = new MyClass();
		MyClass m3 = new MyClass();
		MyClass m4 = new MyClass();
		
		
	}

}
