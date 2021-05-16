package assignment.java.assignment1;

public class Exercise5 {

	// 5. Write a program to print first 10 prime numbers.

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			  boolean flag = isPrimeNumber(i);
			   if(flag)
			       System.out.println(i);
		}

	}
	
	public static boolean isPrimeNumber(int number) {
	    	boolean flag = false;
	         int count = 0;
	         
	         //No number is divisible by more than its half
	         for(int i=2;i<=number/2;i++) //initialization : i=2
	         {
	             //i= divisor
	             if(number%i == 0) //6%2 == 0 : non-prime nos.
	             { 
	                 flag = true;
	             }
	             count++;
	         }
	       
	    	return !flag;
	    }
	
}
