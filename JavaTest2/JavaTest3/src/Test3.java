class Student2{
	private String name;//��ġ ������� �޼ҵ� �ȿ��� ���Ǳ� ���ؼ��� �̸� �����Ǿ� �־����+private�� ���� �����Ǵ°��� �����ϱ����ؼ�
	//���� �̷��� �޼ҵ带 ����� ���� : �����Ҷ� ������ �������� �ʰ� �ϳ��� �ϱ�����
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void gotohSchool() {
		System.out.println(name+"�� �б��� ����.");
	}
	public Student2() {//�⺻������ �����Ǵ� ������ ������ �ҷ����� ���� �⺻������ �����
		System.out.println("Default Constructor");
		name = "������";
	}
}
public class Test3 {
	void s() {};
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("�̼���");
		stu.gotohSchool();
		Student2 stu2;
		stu2 = new Student2();
		stu2.setName("������");
		stu2.gotohSchool();
		Student2 t = execute(stu2);
		t.gotohSchool();
		
		
		Student2 t2 = execute(new Student2());
		t2.setName("�����"); 
		Student2 t3 = new Student2();
		Student2 t4 = execute(t3);
		
		
	}
	static Student2 execute(Student2 s) {
		s.gotohSchool();
		return s;
	}

}
