package Test01;

public class BankAccount {

	private int balance; // 계좌 잔액 저장 변수
	private String ownerName; // 계좌 소유주 이름
	private String password; // 계좌 비밀번호

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void deposit(int money) { // 입금 메소드
		if (money > 0) {
			balance += money;
		}

	}

	public void withdraw(int money){ //출금 메소드
		if (balance >= money){
			balance -= money;
			System.out.println("출금 완료");
	}else{
			System.out.println("잔액 부족");
		}
	}		
	
	public int transfer(int money,BankAccount other){
		if(balance >= money){
			withdraw(money);
			other.deposit(money);
			return money;
		}
		
		else{
			
			System.out.println("잔액 부족 송금 실패");
			return 0;
		}
	}
		
	}

}
