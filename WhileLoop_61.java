//WAP FOR WHILE LOOP
package assignments;

import java.util.ArrayList;

public class WhileLoop_61 {

	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");
		list.add("SQL");
		list.add("API Testing");
		int i = 0;

		// Iterate using while loop
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

	}

}
