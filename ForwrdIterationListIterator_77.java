//WAP to store the elements in a list and use .Iterate method to iterate the elements in forwards direction.
package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForwrdIterationListIterator_77 {

	public static void main(String[] args) {
		// Store elements in a List
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");

		// Get Iterator
		Iterator<String> itr = list.iterator();

		// Forward iteration
		System.out.println("Forward Iteration:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
