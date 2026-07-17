package com.Task53AzureAssessment;

public class TernaryOperators {

	public static void main(String[] args) {

		System.out.println("TERNARY OPERATOR (Movie Ticket)");

		int movieAge = 15;
        String ticket = (movieAge >= 18) ? "Adult Ticket" : "Child Ticket";
        System.out.println("Age: " + movieAge);
        System.out.println("Ticket Type: " + ticket);
	}

}
