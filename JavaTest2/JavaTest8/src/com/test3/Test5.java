package com.test3;

public class Test5 {
	public static void main(String[] args) {
		String str = "test";
		String str1 = "tset";
		if(str == str1) {
			System.out.println("O.K");
		}else {
			System.out.println("no");
		}
		String str2 = new String("test");
		String str3 = new String("test");
		if(str2 == str3) { //new �μ� ���� �ٸ� ��ü�� ��������� ==���δ� ���Ҽ� ����
			System.out.println("O.K");
		}else {
			System.out.println("no");
		}
		if(str2.equals(str3)) { //equal�� �ȿ� �ִ� �װ��� ����
			System.out.println("O.K");
		}
		else {
			System.out.println("no");
		}
	}

}
