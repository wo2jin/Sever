package com.test4;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("so simple");
		String str2 = new String("so simple");
		//��������� �����ϴ� if~else��
		if(str1== str2) {
			System.out.println("str1, str2 ���� ��� ����");
		}else {
			System.out.println("str1, str2 ���� ��� �ٸ�");
		}
		// �� �ν��Ͻ� ������ ���ϴ� if~else�� /equals�� �ν��Ͻ� ���� ��
		if(str1.equals(str2)) {
			System.out.println("str1, str2 ���� ����");
		}else {
			System.out.println("str1, str2 ���� �ٸ�");
		}
	}

}
