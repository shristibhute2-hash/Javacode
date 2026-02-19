/* 	
Check whether following accepts duplicates or not.
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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class DuplicateAcceptanceInColletions_85 {

	public static void main(String[] args) {

		// 1) ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("A");
		System.out.println("ArrayList allows duplicates: " + arrayList);

		// 2) LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("B");
		linkedList.add("B");
		System.out.println("LinkedList allows duplicates: " + linkedList);

		// 3) Vector
		Vector<String> vector = new Vector<>();
		vector.add("C");
		vector.add("C");
		System.out.println("Vector allows duplicates: " + vector);

		// 4) Stack
		Stack<String> stack = new Stack<>();
		stack.push("D");
		stack.push("D");
		System.out.println("Stack allows duplicates: " + stack);

		// 5) PriorityQueue
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("E");
		pq.add("E");
		System.out.println("PriorityQueue allows duplicates: " + pq);

		// 6) LinkedList as Queue
		Queue<String> queue = new LinkedList<>();
		queue.add("F");
		queue.add("F");
		System.out.println("LinkedList (Queue) allows duplicates: " + queue);

		// 7) ArrayDeque
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.add("G");
		deque.add("G");
		System.out.println("ArrayDeque allows duplicates: " + deque);

		// 8) HashSet Duplicates not allowed
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("H");
		hashSet.add("H");
		System.out.println("HashSet allows duplicates: " + hashSet);

		// 9) LinkedHashSet Duplicates not allowed
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("I");
		linkedHashSet.add("I");
		System.out.println("LinkedHashSet allows duplicates: " + linkedHashSet);

		// 10) TreeSet Duplicates not allowed
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("J");
		treeSet.add("J");
		System.out.println("TreeSet allows duplicates: " + treeSet);
	}
}
