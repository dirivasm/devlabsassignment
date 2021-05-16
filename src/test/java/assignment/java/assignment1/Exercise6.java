package assignment.java.assignment1;

import java.util.Scanner;

public class Exercise6 {

	// 6. Write a program to calculate area of triangle. User will enter the values for base and height of the triangle.

	public static void main(String[] args) {

		double base,height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Base:");
		base = scan.nextDouble();
		System.out.println("Enter Height:");
		height = scan.nextDouble();
		scan.close();
		
		double result = (base*height)/2;
		System.out.println("Area: "+result);

	}
	
}
