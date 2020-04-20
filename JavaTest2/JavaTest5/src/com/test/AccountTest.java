package com.test;
class Account{
	String AccountNo;
	String Name;
	int Balance;
	static double interest;
	
	public Account(String accountno,String name, int balance) {
		AccountNo = accountno;
		Name = name;
		Balance = balance;
	
	}
	void deposit(int balance) {
		Balance += balance;
			
	}
	void withdraw(int balance) {
		Balance -= balance;
	}
	void addInterest() {
		Balance += (Balance*interest);
		
	}
	
	public String getAccountNo() {
		return AccountNo;
	}
	public String getAccountName() {
		return Name;
	}
	public int getBalance() {
		return Balance;
	}
	
}

public class AccountTest {

	
	static void printAccount(Account customer){
		System.out.println("���¹�ȣ:"+customer.getAccountNo());
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
		}
	
	public static void main(String[] args){
		Account customer1=new Account("111-222-33333333","������",20000);
		Account customer2=new Account("555-666-77777777","���ſ�",100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���"); 
		Account.interest=0.05;
		customer1.addInterest(); //����� �ݾ�=����+����*������
		customer2.addInterest();//����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
		}

}
