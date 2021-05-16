package assignment.java.assignment4;

import java.util.Collections;
import java.util.TreeMap;

public class Exercise6 {
	
	//6. Get highest and lowest value stored in TreeSet
	public static void main(String args[]) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("One", 1);
		tm.put("Two", 2);
		tm.put("Three", 3);
		
		System.out.println("TreeMap is: "+tm);
		
		System.out.println("Highest Value: " + Collections.max(tm.values()));
		System.out.println("Lowest Value: " + Collections.min(tm.values()));
		
	}
}
