    //Write a Java program to iterate an ArrayList using Iterator
package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator_57 {

	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");

		// Get Iterator
		Iterator<String> itr = list.iterator();                                              

		// Iterate using Iterator
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);

		}

	}
}