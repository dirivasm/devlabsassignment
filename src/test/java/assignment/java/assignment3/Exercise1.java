package assignment.java.assignment3;


public class Exercise1 {

	// 1. Write a program to print the occurrence of each character in the String - DevLabsAlliance Training

	public static void main(String[] args) {

		String str = "DevLabsAlliance Training";
		
		for(int i=0; i<str.length();i++) {
			char a = str.charAt(i);
			int count = getOccurrences(a, str);
			System.out.println("Ocurrences of char "+(a)+" : "+count);
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
