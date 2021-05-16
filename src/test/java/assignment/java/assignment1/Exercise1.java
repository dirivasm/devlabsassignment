package assignment.java.assignment1;

import java.util.Scanner;

public class Exercise1 {

	// 1. Write a program to calculate the factorial of a number using while loop

	public static void main(String[] args) {
		
		int number, factorial;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = scan.nextInt();
		scan.close();
		factorial = 1;
		
		if(number >= 0) {
			for(int i=number;i>0;i--) {
				factorial *=i;
			}
		 System.out.println("Factorial is: "+factorial);
		}
		else {
			System.out.println("Number should be positive");
		}

	}
	
}
