package com.test2;
class Cake{
	public int size;
	public Cake(int size) {
		this.size = size;
	}
	public void showCakeSize() {
		System.out.println("Bread ounces:"+this.size);
	}
}

class CheeseCake extends Cake{
	public int size;
	public CheeseCake(int size1, int size2) {
		super(size1);
		this.size = size2;
	}
	public void showCakeSize() {
		System.out.println("Bread ounces:"+super.size);
		
		System.out.println("Cheese ounces:"+this.size);
	}
}
public class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake(5,7);
		Cake ca2 = ca1;
		
		System.out.println("Bread Ounced:"+ca2.size);
		
		System.out.println("Cheese Ounces:"+ca1.size);
		
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();//class CheeseCake�� �ִ� �������̵��� �޼ҵ带 ���
	}

}
