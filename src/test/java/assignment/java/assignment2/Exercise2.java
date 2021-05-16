package assignment.java.assignment2;


public class Exercise2 {

	// 2. Find all the odd numbers from 79 to 187 

	public static void main(String[] args) {
		
		for (int i = 79; i <= 187; i++) {
			if (i % 2 != 0)
				System.out.println(String.format("Number %d is odd", i));
				
		}
		
	}
	
}
