
public class Test5 {
	public static void main(String[] args) {
		int a = Short.MAX_VALUE;
		System.out.println(a);
		long l = Long.MAX_VALUE;
		System.out.println(l);
		
		long l2 =a;//a�� int���ε��� ��ū long���� Ÿ�Ժ�ȯ ����//implicit conversion(�ڵ��� �� ��ȭ) �ڵ� ����ȯ ���������� ū������
		System.out.println(l2);
		
		short s2 = (short)l2;//explicit conversion(����� �� ��ȯ) ū������ ����������
		System.out.println(s2);
		
		String s3 = "1234";
		int num = Integer.parseInt(s3);
		System.out.println(num);
	}
}
