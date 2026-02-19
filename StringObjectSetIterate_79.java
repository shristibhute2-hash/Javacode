//WAP to store String objects in a set and iterate the elements of SET.
package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringObjectSetIterate_79 {

	public static void main(String[] args) {
		// Store String objects in Set
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Selenium");
		set.add("Automation");
		set.add("Testing");
		set.add("API Testing");
		set.add("SQL");
		set.add("Manual Testing");

		// Iterate Set elements using Iterator
		Iterator<String> itr = set.iterator();

		System.out.println("Set elements are:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
