//WAP to store elements in a vector and utilize all it's methods
package assignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorMethod_81 {

	public static void main(String[] args) {
		// Create Vector
		Vector<String> v = new Vector<>();

		// add()
		v.add("Java");
		v.add("Selenium");
		v.add("Automation");
		v.add("Testing");
		System.out.println("After add(): " + v);

		// addElement() (Legacy)
		v.addElement("Framework");
		System.out.println("After addElement(): " + v);

		// add(index, element)
		v.add(2, "API");
		System.out.println("After add(index, element): " + v);

		// size()
		System.out.println("Size: " + v.size());

		// capacity()
		System.out.println("Capacity: " + v.capacity());

		// get()
		System.out.println("Element at index 1: " + v.get(1));

		// set()
		v.set(1, "Core Java");
		System.out.println("After set(): " + v);

		// contains()
		System.out.println("Contains 'Testing'? " + v.contains("Testing"));

		// indexOf()
		System.out.println("Index of 'Java': " + v.indexOf("Java"));

		// lastIndexOf()
		v.add("Java");
		System.out.println("Last index of 'Java': " + v.lastIndexOf("Java"));

		// remove(Object)
		v.remove("Framework");
		System.out.println("After remove(Object): " + v);

		// remove(index)
		v.remove(2);
		System.out.println("After remove(index): " + v);

		// isEmpty()
		System.out.println("Is Vector empty? " + v.isEmpty());

		// clone()
		Vector<String> clonedVector = (Vector<String>) v.clone();
		System.out.println("Cloned Vector: " + clonedVector);

		// equals()
		System.out.println("v equals clonedVector? " + v.equals(clonedVector));

		// clear()
		clonedVector.clear();
		System.out.println("After clear(), clonedVector: " + clonedVector);

		// Iteration using Enumeration
		System.out.println("\nUsing Enumeration:");
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// Iteration using Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Iteration using ListIterator
		System.out.println("\nUsing ListIterator (Forward):");
		ListIterator<String> listItr = v.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		System.out.println("\nUsing ListIterator (Backward):");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}

}
