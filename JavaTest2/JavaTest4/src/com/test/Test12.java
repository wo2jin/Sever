package com.test;
class A2{
	void aMethod() {System.out.println("aMethod");}
}
class B2 extends A2{
	void aMethod() {System.out.println("aMethod on B2 class");}
	void bMethod() {System.out.println("bMethod");}
}

class C2 extends A2{
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on C2 class");}
}
public class Test12 {
	static void callMethod(B2 b) {
		b.aMethod();
	}
	static void callMethod(C2 c) {
		c.aMethod();
	}
	static void callMethod2(A2 a) {
		a.aMethod();
	}

	public static void main(String[] args) {
		callMethod(new B2());
		callMethod(new C2());
		callMethod2(new B2());
		callMethod2(new C2());
		A2 d = new B2();
		
		// TODO Auto-generated method stub
//		B2 b = new B2();
//		b.aMethod();
//		b.bMethod();
//		A2 a = b;
//		a.aMethod();
//		
//		B2 b1 = (B2)a;
//		b1.aMethod();
//		b1.bMethod();
//		
//		A2 a1 = new B2();
//		
//		C2 c = new C2();
//		c.aMethod();
//		c.cMethod();
//		
//		B2 b2 = new B2();
//		b2.bMethod();
//		b2.aMethod();
	}

}
