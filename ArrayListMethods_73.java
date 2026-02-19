/*WAP using below methods of ArrayList.

1).clone()
2).equals()
3)LastIndexof()//
*/
package assignments;

import java.util.ArrayList;

public class ArrayListMethods_73 {

	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Automation");
		list1.add("Java"); // duplicate element
		list1.add("API Testing");
		list1.add("SQL");
		list1.add("Manual Testing");
		System.out.println("Original List: " + list1);

		// 1️ clone()
		ArrayList<String> list2 = (ArrayList<String>) list1.clone();
		System.out.println("Cloned List: " + list2);

		// 2️ equals()
		System.out.println("list1 equals list2? " + list1.equals(list2));

		// Modify cloned list
		list2.add("Testing");
		System.out.println("After modifying cloned list:");
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);

		// 3️ lastIndexOf()
		int lastIndex = list1.lastIndexOf("Java");
		System.out.println("Last index of 'Java' in list1: " + lastIndex);

	}

}
