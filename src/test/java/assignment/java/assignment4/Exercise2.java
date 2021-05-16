package assignment.java.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {

	//2. Reverse an ArrayList.
	public static void main(String args[]) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		
		System.out.println("Original List: "+myList);
		
		Collections.reverse(myList);

		System.out.println("List AFTER REVERSE: "+myList);

	}
}
