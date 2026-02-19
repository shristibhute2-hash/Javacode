//WAP of ArrayList using .listIterator method to print the objects in the forward iteration as well as in backward iteration
package assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorBackwardAndForwardIteration_75 {

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

		// Get ListIterator
		ListIterator<String> listItr = list.listIterator();

		// Forward iteration
		System.out.println("Forward Direction:");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("......................");
		// Backward iteration
		System.out.println("Backward Direction:");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}

}
