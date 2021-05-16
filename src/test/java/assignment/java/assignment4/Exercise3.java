package assignment.java.assignment4;

import java.util.Hashtable;

public class Exercise3 {

	//3. Check a particular key exists in HashTable.
	public static void main(String args[]) {
		Hashtable<String,String> hm = new Hashtable<String, String>();
		hm.put("One", "First Value");
		hm.put("Two", "Second Value");
		hm.put("Three", "Third Value");
		
		if(hm.containsKey("Three"))
			System.out.println("Key is present in HashTable");
		else
			System.out.println("Key is NOT present in HashTable");
		
	}
}
