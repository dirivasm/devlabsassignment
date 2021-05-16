package assignment.java.assignment3;

import java.util.Scanner;

public class Exercise6 {

	// 6. Write a program to throw NumberFormatException and handle it appropriately with prop message.
	 //If you pass invalid input to parseInt(str), this exception will be thrown.


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		String number = scan.next();
		Integer actualInteger;
		scan.close();
		
		try {
			//Parsing string into Integer
			actualInteger = Integer.parseInt(number);
			System.out.println("You entered this number: "+actualInteger);
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("You did NOT entered a number :(");
		}
		System.out.println("Closing program...");

	}
	
}
