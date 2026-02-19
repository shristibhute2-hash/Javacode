//WAP by using  Scanner class try to find the addition of 2 number from 10 difrrent students
package assignments;

import java.util.Scanner;

public class AdditionOfnumbersFrom10DiffUsers_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter name of Student " + i + "  :");
			String name = sc.next();

			System.out.println("Enter first number");
			int num1 = sc.nextInt();

			System.out.println("Enter second number");
			int num2 = sc.nextInt();

			int sum = num1 + num2;

			System.out.println("Student namme is " + name + " Sum :" + sum);
		}
		sc.close();
	}

}
