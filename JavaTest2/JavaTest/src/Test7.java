
public class Test7 {
	public static void main(String[] args) {
		int a =1;
		System.out.println(++a); //호출하는 당시에 바로 1을 증가한다.
		System.out.println(a);
		int b =1;
		System.out.println(b++); //호출이 되고 난훈에 1을 증가한다.
		System.out.println(b);
				
		
	for (int s=1;s<=10; s++) {
		System.out.println("s: "+s);
	}
	
	for (int i=1;i<=10; ++i) {
		System.out.println("i: "+i);
	}
	
	}

}
