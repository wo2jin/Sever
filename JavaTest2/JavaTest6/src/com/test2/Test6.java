package com.test2;

class MyException extends Exception{
	   public MyException(){
	      super("���� ���� ó�� �Դϴ�.");
	   }
	}
	public class Test6 {

	   public static void main(String[] args) throws MyException {
	      int n = 3;
	      if(n == 3) {
	         
	         try {
	         throw new MyException();
	      }catch(MyException e) {
	         System.out.println(e.getMessage());
	      }
	     }
	   }

}
