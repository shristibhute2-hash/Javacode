//Write a Java program to create a Generic ArrayList
//Example: ArrayList<String>, ArrayList<Integer>, etc.

package assignments;

import java.util.ArrayList;

public class CreateGenericArrayList_56 {

	public static void main(String[] args) {
		// Generic ArrayList of String
		ArrayList<String> names = new ArrayList<>();
		names.add("Java");
		names.add("Selenium");
		names.add("Automation");
		System.out.println("String ArrayList: " + names);

		// Generic ArrayList of Integer
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("Integer ArrayList: " + numbers);

		// Generic ArrayList of Double
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(99.99);
		prices.add(149.50);
		prices.add(199.75);
		System.out.println("Double ArrayList: " + prices);

		// Generic ArrayList of Character
		ArrayList<Character> grades = new ArrayList<>();
		grades.add('A');
		grades.add('B');
		grades.add('C');
		System.out.println("Character ArrayList: " + grades);
	}

}
