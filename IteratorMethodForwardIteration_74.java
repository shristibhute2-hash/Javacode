//WAP using .iterator method to print the objects in the forward iteration
package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethodForwardIteration_74 {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");
		list.add("API Testing");
		list.add("SQL");
		list.add("Manual Testing");

		// Get Iterator
		Iterator<String> itr = list.iterator();

		// Forward iteration
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
