package com.test;

class MyClass3{
	int a;
	static int b;
	public MyClass3() {
		
	}
	public static void setAvaule(int x) { //static�� �̿��Ͽ� ����� �����ϴ�
		b = x;
	}
	public void setBvalue(int y) {
		a = y;
		setAvaule(10);
	}
}

public class Test9 {
	public static void main(String[] args) {
		MyClass3.b = 20;
		MyClass3 m = new MyClass3();
		m.a = 10;
		m.b = 20; //static�� ��� ��� ó������
		
	}

}
