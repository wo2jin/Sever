/*
 * �л�
 * -�̸�,����,Ű....
 * -�����Ѵ�, ��������...
 * 
 */
class Student{
	String name;
	int age;
	int height;
	void study() {
		System.out.println(name+","+age+","+height);
	}
	void gotohome() {
		
	}
}

class School{
	String location;
	int qty;
	void teaching() {}
}

public class Test1 {
	static void test() {
		
		System.out.println(";;;");
	}
	
	void test2() {
		System.out.println("222");
	}

	public static void main(String[] args) {
		

		School s = new School();
		s.location = "��õ";
		s.teaching();
		Student stu = new Student();
		stu.name = "�����";
		stu.age = 27;
		stu.height = 182;
		stu.study();
		
		Student stu2 = new Student();
		
		test();
		Test1.test();
		Test1 t2 = new Test1();
		t2.test2();
	}

}
