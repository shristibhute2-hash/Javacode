//WAP to store data elements in a set and to iterate the elements of set.WAP to store dala elements in a set and to iterate the elements of set.
package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration_78 {

	public static void main(String[] args) {
		// Store elements in a Set
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Selenium");
		set.add("Automation");
		set.add("Testing");

		// Iterate elements using Iterator
		Iterator<String> itr = set.iterator();

		System.out.println("Iterating Set elements:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
