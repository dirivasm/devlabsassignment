package assignment.java.assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise7 {

	//7. Sort ArrayList of Strings alphabetically
	public static void main(String args[]) {

		List<String> myList = new ArrayList<String>();
		myList.add("Roy");
		myList.add("Edward");
		myList.add("Envy");
		myList.add("Alphonse");
		
		System.out.println("Original list is: "+myList);
		
		myList.sort(Comparator.naturalOrder());
		
		System.out.println("List after SORT: "+myList);
		
	}
}
