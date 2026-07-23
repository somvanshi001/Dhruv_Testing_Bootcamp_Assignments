package com.Task53AzureAssessment;

public class AssignmentOperator {

	public static void main(String[] args) {
        
		System.out.println("ASSIGNMENT OPERATORS (Banking)");
        
        int accountBalance = 10000;
        System.out.println("Initial Balance     : " + accountBalance);
        accountBalance += 500;   
        System.out.println("After Deposit (+=500): " + accountBalance);
        accountBalance -= 200;   
        System.out.println("After Withdrawal (-=200): " + accountBalance);
        accountBalance *= 2;     
        System.out.println("After *=2 (bonus demo): " + accountBalance);
        accountBalance /= 2;     
        System.out.println("After /=2 (revert): " + accountBalance);
        accountBalance %= 3000;  
        System.out.println("After %=3000: " + accountBalance);
	}

}
