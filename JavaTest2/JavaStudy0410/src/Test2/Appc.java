package Test2;
// public ���ٿ� ������ ������ ǥ��, 
//default �������������� �⺻ default���·� ����
//privat �ڽ��� Ŭ���� �������� ��밡��
//protected : ������ ��Ű�� ���� �����ϰų� �Ļ��� Ŭ���������� ���� ����
public class Appc {
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void a1() {
		System.out.println("public �޼ҵ� a1�Դϴ�.");
	}
	private void b1() {
		System.out.println("private �޼ҵ� b1�Դϴ�.");
	}
	protected void c1() {
		System.out.println("protected �޼ҵ� c1�Դϴ�.");
	}
	void d1() {
		System.out.println("�⺻ �޼ҵ� d1�Դϴ�.");
	}
}
