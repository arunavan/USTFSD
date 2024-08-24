package com.ust;
//abstraction, multiple inheriatnce
interface Loan{
	void applyLoan();
	int disburse();
	
}
interface Bank{
	void deposit(int amount);
	void withdraw(int amount);
	int getBalance();
}
class Customer1 implements Loan,Bank{
	public void applyLoan() {
		
	}
	public int disburse() {
		return 9999;
	}
	public void deposit(int amount) {
		
	}
	public void withdraw(int amount) {
		
	}
	public int getBalance() {
		return 888;
	}
		
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Loan l=new Customer1();
		l.applyLoan();
		l.disburse();
		Bank b=new Customer1();
		b.deposit(6000);
		b.getBalance();
		b.withdraw(888);
		
	}

}
