//WAP of array list using below methods.
//a)contains()
//b)containsAll()
package assignments;

import java.util.ArrayList;

public class ArrayListContains_68 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Automation");

		// Create second ArrayList
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Selenium");
		list2.add("Automation");

		// a) contains()
		System.out.println("List1 contains 'Java'? " + list1.contains("Java"));
		System.out.println("List1 contains 'Testing'? " + list1.contains("Testing"));

		// b) containsAll()
		System.out.println("List1 contains all elements of List2? " + list1.containsAll(list2));

	}

}
