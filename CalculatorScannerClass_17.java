//Develop Calculator logic using scanner class and switch case.
package assignments;

import java.util.Scanner;

public class CalculatorScannerClass_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number");
		double num1 = sc.nextDouble();

		System.out.println("Enter Second number");
		double num2 = sc.nextDouble();

		System.out.println("Choose the Operation");
		System.out.println("1 Addition (+)");
		System.out.println("2 Subtraction (-)");
		System.out.println("3 Multiplication (*)");
		System.out.println("4 Division (/)");

		System.out.println("Enter your choice 1 to 4");
		int choice = sc.nextInt();

		double result;
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Addition of Two numbers is   " + result);
			break;

		case 2:
			result = num1 - num2;
			System.out.println("Subtraction of Two numbers is   " + result);
			break;

		case 3:
			result = num1 * num2;
			System.out.println("Multiplication of Two numbers is   " + result);
			break;

		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Division of Two numbers is   " + result);
			} else
				System.out.println("Number is not divisible by 0");
			break;

		default:
			System.out.println("Invalid choice .Please select number between 1 to 4 only");

		}
		sc.close();

	}
}
