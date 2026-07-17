package ScannerDemo;

import java.util.Scanner;
	
public class NextLine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter your first name : ");
		String first = keyboard.nextLine();
		System.out.print("Enter your last name : ");
		String lname = keyboard.nextLine();
		System.out.print("Enter your house number : ");
		String housenumber = keyboard.nextLine();
		System.out.print("Enter your street name : ");
		String streetname = keyboard.nextLine();
		System.out.print("Enter your street type : ");
		String streettype = keyboard.nextLine();
		System.out.print("Enter your city : ");
		String city = keyboard.nextLine();
		System.out.print(first+" "+lname+" "+housenumber);
		System.out.print(streetname+" "+ streettype+" "+ city);
	}

}
