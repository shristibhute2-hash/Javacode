//WAP to reverse a string, possibly without using built-in methods like reverse()
package assignments;

import java.util.Scanner;

public class ReverseStringwithoutbiltMethod_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		String reversed = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed += charArray[i];
		}
		System.out.println("Reveres String ; " + reversed);
		sc.close();
	}

}
