class Student3{
	public Student3() {
		System.out.println("Deafult Constructor");
		name = "ȫ�浿";
		age = 20;
	}
	public Student3(String nm, int ag) { //�޼ҵ�Ӹ� �ƴ϶� ������ ��ü�� �����ε��� �����ϴ�. �̷��� �Ǹ� ����Ʈ�����ڰ� ���õǰ� ȣ��ȴ�.
		name =nm;
		age = ag;
	}
	//Overloading(�����ε�) : Ŭ���� �ȿ� ���Ǵ� �޼ҵ� �ȿ��� �̸��� �����ϰ� �Ķ���� ����,Ÿ���� Ʋ�� ���
	//Overriding(�������̵�) : 
	private String name;
	private int age;
	public void setName(String nm) {
		name = nm;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public void gotoSchool() {
		System.out.println(name+","+age+" �� �б��� ����.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nm, int ag) {
		
	}
}
public class Test4 {
	public static void main(String[] args) {
		
		Student3 stu = new Student3();
		stu.gotoSchool();
		
		Student3 stu2 = new Student3("�̼���",30);
		stu2.gotoSchool();
		
	}

}
