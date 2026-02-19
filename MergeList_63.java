//WAP to merge two arraylist using a method with collection parameter.
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class MergeList_63 {

	// Method with Collection parameter
	public static void mergeLists(Collection<String> list1, Collection<String> list2) {
		list1.addAll(list2);
	}

	public static void main(String[] args) {
		// First ArrayList
		ArrayList<String> listA = new ArrayList<>();
		listA.add("Java");
		listA.add("Selenium");
		listA.add("Cucumber");
		listA.add("SQL");
		listA.add("API Testing");

		// Second ArrayList
		ArrayList<String> listB = new ArrayList<>();
		listB.add("Automation");
		listB.add("Testing");
		listB.add("Manual Testing");

		System.out.println("Before Merge:");
		System.out.println("List A: " + listA);
		System.out.println("List B: " + listB);

		// Merge ArrayLists
		mergeLists(listA, listB);

		System.out.println("\nAfter Merge:");
		System.out.println("List A: " + listA);

	}

}
