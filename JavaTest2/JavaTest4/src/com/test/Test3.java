package com.test;

class Calculator{
	int result;
	public Calculator() {
		result =0;//result���� ��� 0���� �ʱ�ȭ�ϰ� ��� ���� �ٽ� ���� �Է¹޴´�.
	}
	
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	//Method Overloaing ���� �޼ҵ���̿��� ž���� �޶� 2���� ���� ����
	int add(int a, int b, int c) {
		int result = a + b +c;
		return result;
	}

}
public class Test3 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(1,2));
		System.out.println(cal.substract(5, 1));
		System.out.println(cal.add(1,2,3));
		
	}

}
