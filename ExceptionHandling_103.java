/*//WAP on how you will handle 

NegativeArraySizeException
InputMismatchException
ArithmeticException*/
package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// InputMismatchException
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			// ArithmeticException
			int result = 100 / num;
			System.out.println("Result: " + result);

			// NegativeArraySizeException
			System.out.print("Enter array size: ");
			int size = sc.nextInt();
			int[] arr = new int[size];

			System.out.println("Array created successfully");

		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException handled: Please enter valid integer input");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled: Division by zero is not allowed");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException handled: Array size cannot be negative");
		} catch (Exception e) {
			System.out.println("General Exception handled");
		}

		System.out.println("Program continues normally...");
	}
}
