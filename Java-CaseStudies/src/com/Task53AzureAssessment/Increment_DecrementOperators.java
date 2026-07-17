package com.Task53AzureAssessment;

public class Increment_DecrementOperators {

	public static void main(String[] args) {

        System.out.println("INCREMENT AND DECREMENT OPERATORS (Website Visitor Counter)");
        int visitors = 250;
        System.out.println("Visitors before increment : " + visitors);
        visitors++;
        System.out.println("Visitors after ++ (new visit) : " + visitors);
        visitors--;
        System.out.println("Visitors after -- (visitor left/error correction): " + visitors);
	}

}
