package com.test;

interface IShape{ //�԰�ȭ�� ������ �����ϴ°�
	void draw(int x, int y);
}

class Circle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Circle:"+a+","+b);
	}
}
class Rectangle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Rectangle:"+a+","+b);
	}
}

class DrawManager{
	IShape s;
	public DrawManager(IShape s) { //Ishpae s = new Circle();
		this.s = s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}
public class Test4 {

	public static void main(String[] args) {
		DrawManager d = new DrawManager(new Circle()); //DrawManger������ circle��ü�� ����
		d.draw(1, 2);
		DrawManager d2 = new DrawManager(new Rectangle());
		d2.draw(1, 2);

	}

}
