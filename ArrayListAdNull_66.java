//WAP to add null value to a array list
//ArrayList Allow to add null elements
package assignments;

import java.util.ArrayList;

public class ArrayListAdNull_66 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// Add elements
		list.add("Java");
		list.add("Selenium");

		// Add null value
		list.add(null);

		// Add another element
		list.add("Automation");

		System.out.println(list);

	}

}
