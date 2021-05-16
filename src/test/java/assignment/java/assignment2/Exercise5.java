package assignment.java.assignment2;


public class Exercise5 {

	// 5. Reverse a number 123

	public static void main(String[] args) {
		
		int number = 123;
		char[] array = String.valueOf(number).toCharArray();
		String reversedNumber = "";
		
		for (int i = array.length-1; i >= 0; i--) {
			reversedNumber += array[i];
		}
		
		System.out.println("Reverse number is: "+reversedNumber);
		
	
	}
	
}
