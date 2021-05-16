package assignment.java.assignment1;

public class Exercise3 {

	// 3. Write a program to sort the elements of an array in ascending order

	public static void main(String[] args) {

		int array[] = {8,6,7,1,24,10};
		int arrayLenght = array.length;
		int aux;

		//Using bubble sort
		for (int j = 0; j < arrayLenght; j++) {
	   	   for (int i = j + 1; i < arrayLenght; i++) {
			if (array[i] < array[j]) {
				aux = array[j];
				array[j] = array[i];
				array[i] = aux;
			}
		   }
		}
		
		for(int i=0;i<arrayLenght;i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
