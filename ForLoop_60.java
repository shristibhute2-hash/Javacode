//WAP using For Loop
package assignments;

import java.util.ArrayList;

public class ForLoop_60 {

	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");
		list.add("SQL");
		list.add("API Testing");
		// Iterate using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
