class BankAccount{
	String accNumber;//�ν��Ͻ� ����
	String ssNumber;
	int balance =0;
	
	//�ν��Ͻ� �޼ҵ�
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("���¹�ȣ : " + accNumber);
		System.out.println("�ֹι�ȣ : " + ssNumber);
		System.out.println("��      �� : " + balance+"\n");
		return balance;
	}
}
public class BankAccountUniID {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();//�Ű�����
		yoon.initAccount("33-55-09", "770088-5959007", 20000);//���� ����
		
		BankAccount park = new BankAccount();
		park.initAccount("33-55-09", "770088-5959007", 20000);
		
//		yoon.
	}
	
	

}
