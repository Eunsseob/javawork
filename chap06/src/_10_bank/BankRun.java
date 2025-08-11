package _10_bank;

public class BankRun {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000);
		
		System.out.println("잔액 : " + bank.getBalance());
		
		bank.withdraw(3000);

		System.out.println("잔액 : " + bank.getBalance());
		
		bank.withdraw(20000);
		
		System.out.println("잔액 : " + bank.getBalance());
	}
}
