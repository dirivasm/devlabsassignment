package assignment.java.assignment3;


public class Exercise10 {

	// 10. Write a program where you pass an argument while throwing an exception

	public static void main(String[] args) {

		try {
			
			throwExceptionWithArgument();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Closing Program...");

	}
	
	public static void throwExceptionWithArgument() throws NumberFormatException {
		throw new NumberFormatException("Argument while throwing a NumberFormatException");
	}

}
