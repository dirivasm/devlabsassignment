package assignment.java.assignment1;

public class Exercise2 {

	// 2. Write a program to print fibonacci series (10 values)

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int result;
		
		//First 2 values
		System.out.print("0,1");
		
		//8 more values to get a total of 10 fibonacci series values
		for(int i=1;i<=8;i++) {
			result = a+b;
			System.out.print(","+result);
			a=b;
			b=result;
		}

	}
	
}
