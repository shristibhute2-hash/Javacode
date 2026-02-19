/*  WAP Check whether Order of inserrtion is applicable for following or not.
1)ArrayList
2)LinkedList
3)Vector
4)Stack
5)PriorityQueue
6)LinkedList(Queue)
7)ArrayDeque
8)HashSet
9)LinkedHashSet
10)TreeSet*/
package assignments;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class InsertionApplicabilityInJava_83 {

	public static void main(String[] args) {

		System.out.println("1) ArrayList");
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println(arrayList); // Order maintained

		System.out.println("\n2) LinkedList");
		List<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println(linkedList); // Order maintained

		System.out.println("\n3) Vector");
		Vector<String> vector = new Vector<>();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		System.out.println(vector); // Order maintained

		System.out.println("\n4) Stack");
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack); // Order maintained (LIFO stack)

		System.out.println("\n5) PriorityQueue");
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("C");
		pq.add("A");
		pq.add("B");
		System.out.println(pq); // Order NOT maintained (priority-based)

		System.out.println("\n6) LinkedList as Queue");
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		System.out.println(queue); // Order maintained (FIFO)

		System.out.println("\n7) ArrayDeque");
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.add("A");
		deque.add("B");
		deque.add("C");
		System.out.println(deque); // Order maintained

		System.out.println("\n8) HashSet");
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		System.out.println(hashSet); // Order NOT maintained

		System.out.println("\n9) LinkedHashSet");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		System.out.println(linkedHashSet); // Order maintained

		System.out.println("\n10) TreeSet");
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		System.out.println(treeSet); // Order NOT maintained (sorted order)

	}

}
