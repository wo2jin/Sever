import java.util.Scanner;
public class Test8 {
	public static void main(String[] args){
//		boolean choice = true;
//		if(choice == true) {
//			System.out.println("ok");
//		}else {
//			System.out.println("cancel");
//		}
//		
//		int x =100;
//		if(x<20) {
//			System.out.println("x<20");
//		}else {
//			System.out.println("x>20");
//		}
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("name:");
		String name = scan.next();
		String beast = "������";
		if(name.equals(beast)) { //�������� ==�� ���� �񱳿����ڷ� �� �Ұ�
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�");
		}
		scan.close();
	}
}
