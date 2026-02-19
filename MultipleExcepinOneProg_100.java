// WAP to logically accommodate  2 or more exceptions in a single program.
package assignments;

import java.util.Scanner;

public class MultipleExcepinOneProg_100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// 1) ArithmeticException
			System.out.print("Enter a number to divide 100: ");
			int num = sc.nextInt();
			int result = 100 / num;
			System.out.println("Result: " + result);

			// 2) ArrayIndexOutOfBoundsException
			int[] arr = { 10, 20, 30 };
			System.out.println("Accessing 5th element: " + arr[4]);

			// 3) NullPointerException
			String str = null;
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Other Exception occurred: " + e.getMessage());
		}

		System.out.println("Program continues after handling exceptions...");
	}
}
