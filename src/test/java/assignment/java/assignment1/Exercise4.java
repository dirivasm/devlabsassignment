package assignment.java.assignment1;

import java.util.Scanner;

public class Exercise4 {

	// 4. Write a program to check current year is leap year or not. User will enter
	// year value

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year value:");
		int yearVal = scan.nextInt();
		scan.close();

		if(isLeapYear(yearVal)) 
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		

	}

	public static boolean isLeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leapYear = true;
				else
					leapYear = false;
			} else
				leapYear = true;
		} else {
			leapYear = false;
		}
		
		return leapYear;
	}

}
