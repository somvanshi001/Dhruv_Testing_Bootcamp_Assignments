package com.Task53AzureAssessment;

public class BitwiseOperatos {

	public static void main(String[] args) {

		System.out.println("BITWISE OPERATORS");

		 int a = 5;  // 0101
	        int b = 3;  // 0011
	        System.out.println("a = " + a + ", b = " + b);
	        System.out.println("a & b  (AND)         : " + (a & b));
	        System.out.println("a | b  (OR)          : " + (a | b));
	        System.out.println("a ^ b  (XOR)         : " + (a ^ b));
	        System.out.println("~a     (Complement)  : " + (~a));
	        System.out.println("a << 1 (Left Shift)  : " + (a << 1));
	        System.out.println("a >> 1 (Right Shift) : " + (a >> 1));
	}

}
