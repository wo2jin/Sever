
public class Test6 {
	public static void main(String[] args) {
		int a =100;
		int b = 10;
		boolean t = (a>b);
		boolean f = (a<b);
		System.out.println(t);
		System.out.println(f);
		System.out.println("(a!=b):"+(a!=b));
		
		boolean e = t&&f;
		boolean g = t||f;
		System.out.println("e: "+e);
		System.out.println("g: "+g);
	}
}
