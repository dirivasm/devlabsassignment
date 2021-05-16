package assignment.java.assignment2;


public class Exercise4 {

	// 4. Find the sum of digits

	public static void main(String[] args) {
		
		int num = 1234;
		char[] array = String.valueOf(num).toCharArray();
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += Character.getNumericValue(array[i]);
		}
		
		System.out.println("SUM of digits is: "+sum);
		
		
	
	}
	
}
