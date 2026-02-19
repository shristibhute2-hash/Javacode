/*//WAP to store elements in a vector and to iterate the elements using

1)Enumeration
2)ListIterator
3)Iterator*/
package assignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIteration_80 {

	public static void main(String[] args) {
		// Store elements in Vector
		Vector<String> vector = new Vector<>();
		vector.add("Java");
		vector.add("Selenium");
		vector.add("Automation");
		vector.add("Testing");
		vector.add("API Testing");
		vector.add("SQL");
		vector.add("Manual Testing");

		// 1️ Iteration using Enumeration (Legacy)
		System.out.println("Using Enumeration:");
		Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// 2️ Iteration using Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 3️ Iteration using ListIterator (Forward & Backward)
		System.out.println("\nUsing ListIterator (Forward):");
		ListIterator<String> listItr = vector.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		System.out.println("\n Using ListIterator (Backward):");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}

}
