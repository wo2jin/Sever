
public abstract class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		d.Bark();
		
		Cat c= new Cat();
		c.breath();
		c.Meow();
		
		Animal a =d; //Dog object, Animal type
		d.breath();
		Dog d2 = (Dog)a;
		d2.Bark();
		d2.breath();
		
		Animal a1 = c;
		a1.breath();//Cat object, Animal type
		
		Animal a3 = new Dog();
		a3.breath();
		Dog d3 = (Dog)a3;
		d3.Bark();
		d3.breath();
		
		Animal a4 = new Cat();
		a4.breath();
		Cat c3 = (Cat)a4;
		c3.breath();
		c3.Meow();
		
//		Animal a10 = new Animal(); //animal obejct, dog type���� �������� �Ұ����ϴ�
//		Dog d10 =(Dog)a10;
		
//		Dog d11 = new Dog(); // Dog��ü�� �����ؼ� animalŸ������ ��ȯ �Ŀ� �ٽ��ѹ� catŸ������ ��ȭ�ص� ��ü�� Dog�̱� ������ �Ұ���
//		Animal a11 =d11;
//		Cat c11 =(Cat)a11;
		
		
		Object o = new Dog();
		Dog d12 = (Dog)o;
		d12.Bark();
		d12.breath();
		
		
	}

}
