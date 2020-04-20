package com.test;

class Account2{
	static double interest;
	private String AccountNo;
	private String AccountName;
	private int Balance;
	public Account2(String AccountNo,String AccountName, int Balance) {
		this.Balance=Balance;
		this.AccountName=AccountName;
		this.AccountNo=AccountNo;
	}
	public void deposit(int n) {
		Balance+=n;
	}
	public void withdraw(int n) {
		Balance-=n;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public String getAccountName() {
		return AccountName;
	}
	public int getBalance() {
		return Balance;
	}
	public void addInterest() {
		Balance=Balance+(int)(Balance*interest);
	}
}
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 customer1=new Account2("111-222-33333333","������",20000);
		Account2 customer2=new Account2("555-666-77777777","���ſ�",100000);
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
	static void printAccount(Account2 customer){
		System.out.println("���¹�ȣ:"+customer.getAccountNo());
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
		}
}
