package com.Constructors.Examples;

public class C_02_OverloadingArgumentType {
	
	public C_02_OverloadingArgumentType(int a, int b){
		int c = a + b;
		System.out.println("sum is : "+c);
	}
	
	public C_02_OverloadingArgumentType(double a, double b){
		double c = a + b;
		System.out.println("sum is : "+c);
	} 
	
	public void display() {
		System.out.println("Constructor Overloading is working successfully");
	}

	public static void main(String[] args) {
		C_02_OverloadingArgumentType obj1 = new C_02_OverloadingArgumentType( 10 , 20 );
		obj1.display();
		
		C_02_OverloadingArgumentType obj2 = new C_02_OverloadingArgumentType( 20.55 , 40.68 );
		obj2.display();

	}

}
