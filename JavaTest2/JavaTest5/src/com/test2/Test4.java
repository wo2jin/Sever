package com.test2;
class Box3 extends Object{//objectd�� �ڽ��� ���� Ÿ��
	String name;
	public Box3(String name) {
		this.name = name;
	}
	public String toString(){
		return this.name;
	}	
}

public class Test4 {
	static void test(Object o) {
		o.toString();
	}
	public static void mian(String[] args) {
		Box3[] arrBoxes = new Box3[2];
		arrBoxes[0] = new Box3("������");
		arrBoxes[1] = new Box3("�Ͼ��");
		System.out.println(arrBoxes[0]);
		System.out.println(arrBoxes[1]);
		test(arrBoxes[0]);
		test(arrBoxes[1]);
		
	
		
	}

}
