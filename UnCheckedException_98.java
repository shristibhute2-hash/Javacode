////WAP for UnChecked Exceptions which is mentioned
package assignments;

public class UnCheckedException_98 {

	public static void main(String[] args) {

		// 1) ArithmeticException
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred");
		}

		// 2) NullPointerException
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred");
		}

		// 3) ArrayIndexOutOfBoundsException
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred");
		}

		System.out.println("Program continues normally...");
	}
}
