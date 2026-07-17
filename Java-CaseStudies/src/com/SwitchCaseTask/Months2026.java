package com.SwitchCaseTask;
import java.util.Scanner;


public class Months2026 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January 2026");
                break;
            case 2:
                System.out.println("February 2026");
                break;
            case 3:
                System.out.println("March 2026");
                break;
            case 4:
                System.out.println("April 2026");
                break;
            case 5:
                System.out.println("May 2026");
                break;
            case 6:
                System.out.println("June 2026");
                break;
            case 7:
                System.out.println("July 2026");
                break;
            case 8:
                System.out.println("August 2026");
                break;
            case 9:
                System.out.println("September 2026");
                break;
            case 10:
                System.out.println("October 2026");
                break;
            case 11:
                System.out.println("November 2026");
                break;
            case 12:
                System.out.println("December 2026");
                break;
            default:
                System.out.println("Invalid month number!");
        }

        sc.close();
    }

}
