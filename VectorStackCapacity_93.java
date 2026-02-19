/*//WAP to prove below collection doubles it's size , when current capacity is exceeded.

1)Vector
2)Stack*/
package assignments;

import java.util.Vector;
import java.util.Stack;

public class VectorStackCapacity_93 {

	public static void main(String[] args) {

		// ===== Vector =====
		Vector<Integer> v = new Vector<>();

		System.out.println("---- Vector ----");
		System.out.println("Initial Capacity: " + v.capacity());

		for (int i = 1; i <= 11; i++) {
			v.add(i);
		}

		System.out.println("Capacity after adding 11 elements: " + v.capacity());
		System.out.println("Size: " + v.size());

		// ===== Stack =====
		Stack<Integer> s = new Stack<>();

		System.out.println("\n---- Stack ----");
		System.out.println("Initial Capacity: " + s.capacity());

		for (int i = 1; i <= 11; i++) {
			s.push(i);
		}

		System.out.println("Capacity after adding 11 elements: " + s.capacity());
		System.out.println("Size: " + s.size());
	}
}
