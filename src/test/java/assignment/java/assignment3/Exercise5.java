package assignment.java.assignment3;


public class Exercise5 {

	// 5. Write a program to count the repeated occurrences of a character in a String and print all the repeated characters.

	public static void main(String[] args) {

	String str = "DevLabsAlliance Training";
	char[] array = new char[str.length()];
	
	//Fill array with standard Chars
	for(int i=0;i<array.length;i++) {
		array[i] = '*';
	}
		
		for(int i=0; i<str.length();i++) {
			char a = str.charAt(i);
			int count = getOccurrences(a, str);
			String str2 = new String(array);
			if(str2.indexOf(a) == -1) {
				array[i] = a;
			}
			if(array[i] != '*')
				System.out.println((a) + " - " +count );
		}
	

	}
	
	public static int getOccurrences(char a, String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(a==s.charAt(i))
				count++;
		}
		return count;
	}
	
}
