//WAP for Checked Exceptions which is mentioned
package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions_97 {

	public static void main(String[] args) {

		try {
			// Checked Exception
			FileInputStream fis = new FileInputStream("abc.txt");
			System.out.println("File opened successfully");
		} catch (FileNotFoundException e) {
			System.out.println("File not found - Checked Exception handled");
		}

		System.out.println("Program continues...");
	}
}
