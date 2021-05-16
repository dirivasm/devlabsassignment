package assignment.java.assignment3;

import java.util.Scanner;

public class Exercise7 {

	// 7. Write a program where a method declares that it throws ArithmeticException. 

	static void filter(int number) throws ArithmeticException{
		if (number >= 5 && number <= 500) {
			System.out.println("Your number is within requested range");
		} else {
			throw new ArithmeticException(
					"Input is not within requested range therefore ArithmeticException is thrown");
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between 5 and 500: ");
		int num = scanner.nextInt();
		scanner.close();
		try {
			filter(num);
			System.out.println("Try block continues");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Catch block continues");
		}
		System.out.println("Closing Program...");

	}
	
}
