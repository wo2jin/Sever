class Employee{
	String name;
	int age;
	void gotWork() {
		System.out.println(name +","+age+"�� ����� �����Ѵ�.");
	}
}
public class Test2 {
	public static void main(String[] args) {
		//value-type(��Ÿ��)vsreference-type(����Ÿ��)
		//jvm
		//stack,heap
		
		int a =1;
		int b = a;
		
		Employee emp = new Employee();
		emp.name = "�����";
		emp.age = 27;
		emp.gotWork();
		Employee  emp2 = emp;
		Employee emp3 = new Employee();
		emp2.gotWork();
		emp3.name ="�ƿ���";
		emp3.age = 17;
		emp3.gotWork();
	}
}
