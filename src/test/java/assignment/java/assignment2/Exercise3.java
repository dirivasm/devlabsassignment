package assignment.java.assignment2;


public class Exercise3 {

	// 3. Is 13 a prime number?

	public static void main(String[] args) {
		
		 boolean flag = isPrimeNumber(13);
		   if(flag)
		       System.out.println("Number 13 is PRIME");
		   else
			   System.out.println("Number 13 is NOT PRIME");
		
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
