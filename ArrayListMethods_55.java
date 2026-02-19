//Write a Java program using ArrayList to demonstrate:
//add(),addAll(),contains(),containsAll(),remove(),removeAll(),isEmpty()

package assignments;

import java.util.ArrayList;

public class ArrayListMethods_55 {

	public static void main(String[] args) {
		// Create first ArrayList
		ArrayList<String> list1 = new ArrayList<>();

		// 1️ add()
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Automation");
		System.out.println("List1 after add(): " + list1);

		// Create second ArrayList
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Testing");
		list2.add("Automation");

		// 2️ addAll()
		list1.addAll(list2);
		System.out.println("List1 after addAll(): " + list1);

		// 3️ contains()
		System.out.println("Contains 'Java'? " + list1.contains("Java"));

		// 4️ containsAll()
		System.out.println("Contains all elements of list2? " + list1.containsAll(list2));

		// 5️ remove()
		list1.remove("Selenium");
		System.out.println("List1 after remove(): " + list1);

		// 6️ removeAll()
		list1.removeAll(list2);
		System.out.println("List1 after removeAll(): " + list1);

		// 7️ isEmpty()
		System.out.println("Is list1 empty? " + list1.isEmpty());

	}

}
