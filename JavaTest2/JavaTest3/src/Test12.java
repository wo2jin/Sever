
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		d.breath();
		
		Cat c = new Cat();
		c.breath();
		
		Animal a = new Dog();
		a.breath();
		
		Animal a1 = new Cat();
		a1.breath();
		test(a); //dog breath
		test(a1); //cat breath

	}
	static void test(Animal a) {
		a.breath();
	}
	

}
