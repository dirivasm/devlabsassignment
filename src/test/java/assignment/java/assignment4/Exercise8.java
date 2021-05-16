package assignment.java.assignment4;

import java.util.HashSet;
import java.util.Hashtable;

public class Exercise8 {

	//8. Get Set view of keys from HashTable
	public static void main(String args[]) {
	
		Hashtable<String,String> ht = new Hashtable<String, String>();
		ht.put("One", "First Value");
		ht.put("Two", "Second Value");
		ht.put("Three", "Third Value");
		
		System.out.println("Original HashTable: "+ht);
		
		HashSet<String> set = new HashSet<String>(ht.keySet());
		
		System.out.println("Set of KEYs is: "+set);
			
	}
}
