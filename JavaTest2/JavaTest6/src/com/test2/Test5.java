package com.test2;
import java.io.IOException;

class MyClass{
	void method() throws IOException {
		throw new IOException("device error");
	}
}

//throws IOException�� ����ó�����ϰ� �����ϰ� �׳� ����
public class Test5 {
	
	public static void main(String[] args) throws IOException {
		MyClass c = new MyClass();
		c.method();
//		int a = 1;
//		int b = 0;
//		int c = a/b;
//		throw new ArithmeticException();
	}

}
