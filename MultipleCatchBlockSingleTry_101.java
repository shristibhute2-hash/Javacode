//WAP on exception handling using one try block and multiple catch blocks.
package assignments;

public class MultipleCatchBlockSingleTry_101 {

	public static void main(String[] args) {

		try {
			// ArithmeticException
			int a = 10 / 0;

			// ArrayIndexOutOfBoundsException
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);

			// NullPointerException
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		} catch (Exception e) {
			System.out.println("General Exception caught");
		}

		System.out.println("Program continues normally...");
	}
}
