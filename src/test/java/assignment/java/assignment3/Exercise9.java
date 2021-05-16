package assignment.java.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9 {

	// 9. Write a program to re-throw an exception. ( throw inside catch block)

	public static void main(String[] args) {

		try {
			int n = requestData();
			System.out.println("Your number is: " + n);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Closing Program..");
	}

	public static int requestData() {
		int number1;
		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number: ");
			number1 = scan.nextInt();
			scan.close();

		} catch (Exception e) {
			throw new InputMismatchException("Input is not a Number - Please enter a Number");
		}
		return number1;
	}

}
