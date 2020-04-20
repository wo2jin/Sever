package com.test;

interface Animal{
	void breath();
}

class Dog implements Animal{ //implent�� interface�� ������ ������ �޼ҵ带 �����������
	public void breath() {
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Bark breath");
	}
}
class Cat implements Animal{
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Meow breath");
	}
}
public class Test3 {
//	Animal a = new Animal();//�������̽��� ��üȭ ��Ű�� ����
	static void test(Animal a) {
		a.breath();
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		a.breath();
		
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
}
