//WAP on palindrome
package assignments;

import java.util.Scanner;

public class Palindrome_33 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.next();

		String rev = "";

		// Reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Check palindrome
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is Not a Palindrome");
		}
	}
}
