package assignment.java.assignment4;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise5 {

	//5. Copy all elements of a HashSet to an Object array.
	public static void main(String args[]) {
	
		HashSet<String> hm = new HashSet<String>();
		hm.add("One");
		hm.add("Two");
		hm.add("Three");
		hm.add("Four");
		
		Object[] array = hm.toArray();
		
		System.out.println("Array is: "+Arrays.asList(array));
		
	}
}
