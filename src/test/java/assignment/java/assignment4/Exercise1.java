package assignment.java.assignment4;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise1 {

	//1. Find duplicate characters with their occurrences count using HashMap
	public static void main(String args[]) {
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 1);
		
		System.out.println("HashMap: "+hm);
		
		HashSet<Integer> set = new HashSet<Integer>(hm.values());
		
		if(hm.size() == set.size()) {
			System.out.println("No duplicate values");
		}else {
		        for (Integer s: set) {
		            System.out.println(s + ": " + Collections.frequency(hm.values(), s));
		        }
		}
		
	}

}
