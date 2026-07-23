package com.Task52_AzureAssessment;

public class Ecommerce_Discount {

	public static void main(String[] args) {
		System.out.println("E-commerce Discount");
		double purchaseAmount = 7500;
        System.out.println("Purchase Amount: Rs. " + purchaseAmount);
        if (purchaseAmount >= 5000) {
            double discount = purchaseAmount * 0.10;
            System.out.println("Result: Eligible for 10% discount = Rs. " + discount);
        }
	}

}
