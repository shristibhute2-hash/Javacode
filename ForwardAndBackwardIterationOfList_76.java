//WAP to store the elements in a List and iterate them in forward and backwards way
package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForwardAndBackwardIterationOfList_76 {

	public static void main(String[] args) {

		// Store elements in List
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");
		list.add("API Testing");
		list.add("SQL");
		list.add("Manual Testing");

		// Get ListIterator
		ListIterator<String> itr = list.listIterator();

		// Forward iteration
		System.out.println("Forward Iteration:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("......................");
		// Backward iteration
		System.out.println("Backward Iteration:");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
