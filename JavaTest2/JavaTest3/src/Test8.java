
public class Test8 {
	
	public static void main(String[] args) {
		Animal a= new Animal();
		Dog d = new Dog();
		
		Animal a1 = d; //Dog�� Animall�� ��� Ŭ�������� animal�� ��Ҹ� ������ animalŸ������ ��ȯ�����ϴ� Dog -> Animal �Ͻ��� ĳ���� Animal ->Dog ����� ĳ����
		a1.breath();
		Dog d1 = (Dog)a1;
		d1.Bark();
		
		Cat c = new Cat();
		Animal a2 = c;
		
		Dog d2 = (Dog)a;
		
		
	}
	static void Test(Dog d) {}
	static void Test2(Cat d) {}

}
