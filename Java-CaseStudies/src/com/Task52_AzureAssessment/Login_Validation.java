package com.Task52_AzureAssessment;

public class Login_Validation {

	public static void main(String[] args) {

		System.out.println("Login Validation ");
		String expUsername = "admin";
        String expPassword = "admin123";
        String actUsername = "admin";
        String actPassword = "admin123";
        System.out.println("Entered Username: " + actUsername);
        System.out.println("Entered Password: " + actPassword);
        if (actUsername.equals(expUsername) && actPassword.equals(expPassword)) {
            System.out.println("Result: Login Test Passed - credentials matched.");
        }
	}

}
