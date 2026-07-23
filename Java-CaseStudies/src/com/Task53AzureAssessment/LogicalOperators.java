package com.Task53AzureAssessment;

public class LogicalOperators {

	public static void main(String[] args) {
        
		System.out.println("LOGICAL OPERATORS (Internet Banking Login)");
		
		 boolean username = true;
	        boolean password = true;
	        System.out.println("username && password : " + (username && password));
	        System.out.println("username || password  : " + (username || password));
	        System.out.println("!username             : " + (!username));
	        if (username && password) {
	            System.out.println("Result: Login Successful");
	        } else {
	            System.out.println("Result: Login Failed");
	        }
	}

}
