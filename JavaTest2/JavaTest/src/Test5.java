
public class Test5 {
	public static void main(String[] args) {
		int a = Short.MAX_VALUE;
		System.out.println(a);
		long l = Long.MAX_VALUE;
		System.out.println(l);
		
		long l2 =a;//a는 int형인데도 더큰 long으로 타입변환 가능//implicit conversion(자동형 형 변화) 자동 형변환 작은형에서 큰형으로
		System.out.println(l2);
		
		short s2 = (short)l2;//explicit conversion(명시적 형 변환) 큰형에서 작은형으로
		System.out.println(s2);
		
		String s3 = "1234";
		int num = Integer.parseInt(s3);
		System.out.println(num);
	}
}
