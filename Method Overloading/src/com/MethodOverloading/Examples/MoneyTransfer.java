package com.MethodOverloading.Examples;

public class MoneyTransfer {
	
	public void transfer(double amount) {
		System.out.println("Transferred Amount : " + amount);
	}
	
	public void transfer(double amount, String accountnumber) {
		System.out.println("Transferred Amount : " + amount+"  to Account "+ accountnumber);
	}
	
	public void transfer(double amount, String accountnumber, String remarks) {
		System.out.println("Transferred Amount : " + amount );
		System.out.println("Account Number : "+ accountnumber);
		System.out.println("Remarks : " + remarks );
	}

	public static void main(String[] args) {
		MoneyTransfer mt = new MoneyTransfer();
		mt.transfer(10000);
		mt.transfer(12000,"PUNB0442356");
		mt.transfer(1100,"SBIN2536321", "Tution Fees");

	}

}
