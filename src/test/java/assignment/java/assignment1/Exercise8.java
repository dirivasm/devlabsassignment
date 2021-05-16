package assignment.java.assignment1;

import java.util.Scanner;

public class Exercise8 {

	//8. Write a program to reverse the elements of an array where the array size as well as the array values are entered by the user.

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter SIZE for your array:");
		number = scan.nextInt();
		
		String strArray[] = new String[number];
		for(int i=0;i<number;i++) {
			System.out.println("Enter Data #"+(i+1)+":");
			strArray[i] = scan.next();
		}
		scan.close();
		System.out.println("=========================");
		strArray = reverseArray(strArray, number);
		for(int i=0;i<number;i++) {
			System.out.println(strArray[i]);
		}
		
	}
	
	public static String[] reverseArray(String[] originalArray, int size) {
		String tempArray[] = new String[size];
		int j=0;
		for(int i=size-1;i>=0;i--) {
			tempArray[j++] = originalArray[i];
		}
		return tempArray;
		
	}
	
}
