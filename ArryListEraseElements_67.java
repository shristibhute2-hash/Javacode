//WAP to erase all the elements of the arraylist.
package assignments;

import java.util.ArrayList;

public class ArryListEraseElements_67 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Selenium");
		list.add("Automation");

		System.out.println("Before clear: " + list);

		// Erase all elements
		list.clear();

		System.out.println("After clear: " + list);

		// Check if empty
		System.out.println("Is ArrayList empty? " + list.isEmpty());

	}

}
