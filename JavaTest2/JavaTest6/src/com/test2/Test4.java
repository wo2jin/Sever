package com.test2;

public class Test4 {
	public static void main(String[] args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c= a/b;	
//			System.out.println("�ߵ�");
			int a[] = new int[5];
			a[5]= 0;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���������ϴ�.");
			System.out.println(e.getMessage());
		}
//exception �Ʒ��� �Ļ��Ǵ� �͵��� �ֱ⶧���� �������� exception�� ������ ��ġ�°� ���� �� ������ �ִ�.
//����ȭ ���� ������ ��� ����ó���� ���Դ��� �˼� ����.
		catch(Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
