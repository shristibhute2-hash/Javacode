/*WAP of Arraylist using below methods.

a)remove(object)
b)remove(index,element)
c)removeAll(Collection)*/

package assignments;

import java.util.ArrayList;

public class ArrayListRemove_69 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("Automation");
		list.add("Testing");

		System.out.println("Original List: " + list);

		// a) remove(object)
		list.remove("Selenium");
		System.out.println("After remove(object): " + list);

		// b) remove(index)
		list.remove(1); // removes element at index 1
		System.out.println("After remove(index): " + list);

		// Create another collection
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Java");

		// c) removeAll(Collection)
		list.removeAll(list2);
		System.out.println("After removeAll(Collection): " + list);

	}

}
