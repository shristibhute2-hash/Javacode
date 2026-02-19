//Write a Java program using Enumeration 
package assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_59 {

	public static void main(String[] args) {
		// Create Vector (Enumeration works with legacy classes)
		Vector<String> vector = new Vector<>();

		vector.add("Java");
		vector.add("Selenium");
		vector.add("Automation");
		vector.add("Testing");
		vector.add("API Testing");
		vector.add("SQL");
		// Get Enumeration
		Enumeration<String> en = vector.elements();

		// Iterate using Enumeration
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
