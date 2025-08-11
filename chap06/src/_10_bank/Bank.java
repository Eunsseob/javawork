package _10_bank;

public class Bank {

	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance < money)
			System.out.println("잔고 부족");
		else 
			balance -= money;
	}
	
	public int getBalance() {
		return balance;
	}
}
