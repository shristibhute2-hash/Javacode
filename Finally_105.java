//WAP on Finally
package assignments;

public class Finally_105 {

	public static void main(String[] args) {

		try {
			int a = 10 / 0; // ArithmeticException
			System.out.println("Inside try block");
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block always executes");
		}

		System.out.println("Program continues normally...");
	}
}
