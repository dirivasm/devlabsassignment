package assignment.java.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8 {

	// 8. Write a program with nested try blocks.

	public static void main(String[] args) {

		//Divide 2 numbers
		try {
			int number1, number2;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number: ");
			number1 = scan.nextInt();
			System.out.println("Enter secund number: ");
			number2 = scan.nextInt();
			scan.close();
			try {
				int result;
				result = number1/number2;
				System.out.println("Result is: "+result);
				
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Closing Program..");
	}
	
}
