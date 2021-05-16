package assignment.java.assignment1;

public class Exercise10 {

	// 10. Write a program to print this output using two-dimensional array.
	/*
	 * 0 
	 * 00 
	 * 000 
	 * 0000 
	 * 00000 
	 * 000000 
	 * 0000000 
	 * 00000000 
	 * 000000000 
	 * 0000000000
	 */

	public static void main(String[] args) {

		//Filling array with 0
		int charray[][] = new int[10][10];
		for (int i = 0; i < charray.length; i++) {
			for (int j = 0; j < charray.length; j++)
				charray[i][j] = 0;
		}

		String space = " ";
		for (int i = 0; i < charray.length; i++) {

			//Print space considering array size - iteration number
			for (int j = charray.length - i; j > 1; j--)
				System.out.print(space);

			//Print the actual 0 char 
			for (int j = 0; j <= i; j++)
				System.out.print(charray[i][j] + space);

			System.out.println();
		}
	}

}
