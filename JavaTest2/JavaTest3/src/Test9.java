
public class Test9 {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		Animal a1 = new Dog();
		a1.breath();
		Animal a2 = new Cat();
		a2.breath();
		
		Dog d1 = (Dog)a;
		
		Animal a11 = Test(new Dog());
		Dog d2 = (Dog)a11;
		d2.Bark();
		
		Test3(new Dog());
	}
	static Animal Test(Animal a) {//DogŸ�԰� CatŸ�� ��� ������ �ִ� ���� �̷��� �Ұ����ҽ� Ÿ�Ժ��� ��� �޼ҵ带 �������Ѵ�.
		return new Dog();
	}
	static void Test3(Animal a) { //Animal a = new Dog();
	}
	
}
