package assignment.java.assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Exercise6 {

	// 6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 
	
	public static void main(String[] args) {
		
		Integer[] array = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		System.out.println("Array : "+Arrays.asList(array));
		
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array));
		
		if(array.length == set.size()) {
			System.out.println("No duplicate values");
		}else {
		        for (Integer s: set) {
		            System.out.println(s + ": " + Collections.frequency(Arrays.asList(array), s));
		        }
		}
		
	
	}
	
}
