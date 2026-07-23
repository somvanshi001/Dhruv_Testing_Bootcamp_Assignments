package com.Task53AzureAssessment;

public class RelationalOperator {

	public static void main(String[] args) {
		
		System.out.println("RELATIONAL OPERATORS (Voting System)");
		
		int age = 17;
        System.out.println("Age: " + age);
        System.out.println("age == 18 : " + (age == 18));
        System.out.println("age != 18 : " + (age != 18));
        System.out.println("age > 18  : " + (age > 18));
        System.out.println("age < 18  : " + (age < 18));
        System.out.println("age >= 18 : " + (age >= 18));
        System.out.println("age <= 18 : " + (age <= 18));
        if (age >= 18) {
            System.out.println("Result: Eligible to vote.");
        } else {
            System.out.println("Result: Not eligible to vote (below 18).");
        }
	
	}

}
