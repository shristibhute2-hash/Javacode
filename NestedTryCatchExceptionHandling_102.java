//WAP on exception handling using nested try catch blocks
package assignments;

public class NestedTryCatchExceptionHandling_102 {

	public static void main(String[] args) {

		try {
			// Outer try block
			System.out.println("Outer try block");

			try {
				// Inner try block
				int a = 10 / 0; // ArithmeticException
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException handled in inner catch");
			}

			try {
				int[] arr = { 1, 2, 3 };
				System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException handled in inner catch");
			}

		} catch (Exception e) {
			System.out.println("Exception handled in outer catch");
		}

		System.out.println("Program continues normally...");
	}
}
