package assignment.java.assignment2;


public class Exercise1 {

	// 1. Java Program to Calculate average of numbers using Array

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		int average = sum/array.length;
		System.out.println("Average is: "+average);
	
	}
	
}
