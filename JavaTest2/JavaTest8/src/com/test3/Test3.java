package com.test3;

class MyClass{
	
	public MyClass(){
		System.out.println("Default Constructor");
	}
	
	public String toString() {
		return "MyClass";
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("End");
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		System.out.println(mc.toString());
		
		Object o = new Object();
		System.out.println(o.hashCode());
		Object o1 = new Object();
		System.out.println(o1.hashCode());
		Object o2 = new Object();
		System.out.println(o2.hashCode());
		System.out.println(o2.toString());
		
	}

}
