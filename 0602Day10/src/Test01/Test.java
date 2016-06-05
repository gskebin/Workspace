package Test01;

public class Test {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
				
	   b1.deposit(10000);
	   b1.transfer(500, b2);
	   
	   System.out.println("b1의 잔액:"+b1.getBalance());
	   System.out.println("b2의 잔액:"+b2.getBalance());
	}
}
