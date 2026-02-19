//WAP to add a element to a Array list in a 3rd index position.
package assignments;

import java.util.ArrayList;

public class ArrayListAddElement_64 {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList();
		listA.add("Java");
		listA.add("Selenium");
		listA.add("Cucumber");
		listA.add("SQL");
		listA.add("API Testing");

		System.out.println("Before insering new elememt  " + listA);
		listA.add(3, "Framework");

		System.out.println("After insering new elememt  at index 3  " + listA);

	}

}
