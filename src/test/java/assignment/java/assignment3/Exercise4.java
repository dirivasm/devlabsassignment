package assignment.java.assignment3;


public class Exercise4 {

	// 4. Write a program to convert String to a character array and character array to String

	public static void main(String[] args) {
		
		String str = "This is my string";
		System.out.println("Print original string: "+str);
		
		char[] charArray = str.toCharArray();
		System.out.println("Print array of char converted from a String and updating 'i' char with 'x' char");
		
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
			if(charArray[i] == 'i')
				charArray[i] = 'x';
		}
		System.out.println();
		
		String str2 = new String(charArray);
		System.out.println("Print string converted from char array: "+str2);


	}
	
}
