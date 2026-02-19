//WAP to prove that Arraylist is dynamic in nature.
package assignments;

import java.util.ArrayList;

public class ArrayListDynamic_70 {

	public static void main(String[] args) {
		// Create ArrayList with initial capacity (optional)
		ArrayList<Integer> list = new ArrayList<>(2);

		System.out.println("Initial size: " + list.size());

		// Adding elements dynamically
		list.add(10);
		list.add(20);
		System.out.println("Size after adding 2 elements: " + list.size());

		// Adding more elements beyond initial capacity
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("Size after adding more elements: " + list.size());
		System.out.println("Elements in ArrayList: " + list);

	}

}
