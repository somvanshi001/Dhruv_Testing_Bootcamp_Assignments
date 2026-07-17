package com.Task53AzureAssessment;

public class UranaryOperators {

	public static void main(String[] args) {
        
		System.out.println("UNARY OPERATORS (Account Lock Status)");
		
		boolean accountLocked = false;
        int score = 10;
        System.out.println("accountLocked        : " + accountLocked);
        System.out.println("!accountLocked (NOT) : " + (!accountLocked));
        System.out.println("+score (Unary Plus)  : " + (+score));
        System.out.println("-score (Unary Minus) : " + (-score));
        System.out.println("Result: " + (!accountLocked ? "Account is NOT locked" : "Account is locked"));
	}

}
