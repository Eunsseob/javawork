package _09_access;

import _10_bank.Bank;

public class AccessRun {

	public static void main(String args[]) {
		Acess ac = new Acess();
		
		// int num = ac.num; 접근 불가
		ac.setNum(5);
		System.out.println(ac.getNum());
		
		// int num = ac.num; 접근 불가
		ac.getNum();
		
		Bank bank = new Bank();
		bank.deposit(5000);
		bank.withdraw(3000);
		System.out.println(bank.getBalance());
	}
}
