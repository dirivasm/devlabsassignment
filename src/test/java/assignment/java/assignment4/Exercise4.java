package assignment.java.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise4 {

	// 4. Convert keys of a map to a list.
	public static void main(String args[]) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 1);
		
		List<String> myList = new ArrayList<String>(hm.keySet());
		System.out.println("List of keys is: "+myList);
		
	}
}
