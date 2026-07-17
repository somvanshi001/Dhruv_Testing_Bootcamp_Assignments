package com.Interface.Examples;

interface FirstInterface{
	public void myMethod();
}

interface SecondInterface{
	public void myOtherMethod();
}

class Democlass implements FirstInterface, SecondInterface{
	public void myMethod() {
		System.out.println("Enter some text ... ");
	}
	
	public void myOtherMethod() {
		System.out.println("Enter some other text ... ");
	}
}
public class Main {

	public static void main(String[] args) {
		Democlass myobj = new Democlass();
		myobj.myMethod();
		myobj.myOtherMethod();

	}

}
