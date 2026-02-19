//WAP to declare and throw an exception in a program with exception message as "Hello World"
package assignments;

public class ThrowException_99 {

	public static void main(String[] args) {

		try {
			// Throwing exception explicitly
			throw new Exception("Hello World");
		} catch (Exception e) {
			// Catching and printing exception message
			System.out.println("Exception caught: " + e.getMessage());
		}

		System.out.println("Program continues normally...");
	}
}
