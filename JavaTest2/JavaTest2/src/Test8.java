
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		boolean search = false;
		while (num<100) {
			if(((num%5)==0)&&((num%7)==0)) {
				search = true;
				break;
			}
			num++;
		}
		if(search==true) {
			System.out.println("ã�� ����:"+num);
		}else {
			System.out.println("");
		}

	}

}
