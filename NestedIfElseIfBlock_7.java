
//Write a Program on nested if Else Block_Case
package assignments;

public class NestedIfElseIfBlock_7 {

	public static void main(String[] args) {
		int number = 16;
		if (number >= 0) {
			System.out.println("Number is positive");
			if (number % 2 == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is Odd");
			}

		} else {
			System.out.println("Number is Negative");

		}

	}
}