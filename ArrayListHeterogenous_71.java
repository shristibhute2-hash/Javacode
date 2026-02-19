//WAP to prove that Arraylist can strore heterogenious elements
package assignments;

import java.util.ArrayList;

public class ArrayListHeterogenous_71 {

	public static void main(String[] args) {
		// Create ArrayList without generics (raw type means heterogenous type)
		ArrayList list = new ArrayList();

		// Add heterogeneous elements
		list.add("Java"); // String
		list.add(100); // Integer
		list.add(99.99); // Double
		list.add('A'); // Character
		list.add(true); // Boolean
		list.add(null); // null value

		// Print ArrayList
		System.out.println(list);

	}

}
