package com.Inheritance.Examples;

class Account{
	String accountHolder = "Dhruv Somvanshi";
	double balance = 100000;
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount Withdraw: " + amount);
	}
	public void Displayblanace(){
		System.out.println("Current Balance: " + balance);
	}
}

class SavingsAccount extends Account{
	
	public void calculateInterest(){
		double Interest = balance * 5/100;
		System.out.println("Interest Earned: " + Interest);
	}
}
public class BankingApplication {
	public static void main(String [] args) {
		SavingsAccount sa = new SavingsAccount();
		System.out.println("Account Holder: " + sa.accountHolder);
		sa.Displayblanace();
		sa.deposit(5000);
		sa.withdraw(20000);
		sa.Displayblanace();
		sa.calculateInterest();
	}
}
