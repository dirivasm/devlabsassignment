package assignment.java.assignment3;

import java.util.Scanner;

public class Exercise2 {

	// 2. Write a program to check if a given string is a palindrome or not. Palindrome example : trurt

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = scan.next();
		scan.close();
		StringBuffer strB = new StringBuffer(str);
		
		System.out.println("Reversing your word..");
		strB.reverse();
		
		System.out.println("Your word is: "+str);
		System.out.println("Your word reversed is: "+strB.toString());

		if(str.equalsIgnoreCase(strB.toString()))
			System.out.println("Your word IS Palindrome");
		else
			System.out.println("Your word is NOT Palindrome");
		
		
	}
	
}
