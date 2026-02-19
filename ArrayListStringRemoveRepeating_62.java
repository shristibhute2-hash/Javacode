//Given an ArrayList of Strings, remove all occurrences of the word "apple".
//For example:  [apple, banana, apple, orange] → [banana, orange]

package assignments;

import java.util.ArrayList;

public class ArrayListStringRemoveRepeating_62 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");

		System.out.println("Before removal: " + fruits);

		// Remove all occurrences of "apple"
		while (fruits.contains("apple")) {
			fruits.remove("apple");
		}

		System.out.println("After removal: " + fruits);

	}

}
