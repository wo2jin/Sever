
public class Test5 {
	public static void main(String[] args) {
		int a=1;
		while (a<10) {
			System.out.println(a);
			a++;
		}
		
		a=1;
		do {
			System.out.println(a);
			a++;
		}
		while(a<10);
		System.out.println("for syntax");
		for(int a2=1;a2<10;a2++) {
			System.out.println(a2);
		}
		
		//1~10���� ��
		System.out.println("for 1~10��");

		int a3 =0;
		for(int b=1;b<=10;b++) {
			a3+=b;
			
		}System.out.println(a3);
		System.out.println("while 1~10��");

		int b=1;
		int a4=0;
		while(b<=10) {
			a4+=b;
			System.out.println(a4);
			b++;
		}
		
		System.out.println("=======");
		int i;
		for(i=1;i<=10;i++) {
			i += i;
			System.out.println(i);
		}
		
		System.out.println("������ ������");
	}
}
