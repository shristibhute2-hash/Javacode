/* 	
Check whether following can be sorted or not.
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CheckSortibilityInCollections_86 {

	public static void main(String[] args) {
		// 1) ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 1, 2));
		Collections.sort(arrayList);
		System.out.println("ArrayList can be sorted: " + arrayList);

		// 2) LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 1, 2));
		Collections.sort(linkedList);
		System.out.println("LinkedList can be sorted: " + linkedList);

		// 3) Vector
		Vector<Integer> vector = new Vector<>(Arrays.asList(3, 1, 2));
		Collections.sort(vector);
		System.out.println("Vector can be sorted: " + vector);

		// 4) Stack
		Stack<Integer> stack = new Stack<>();
		stack.addAll(Arrays.asList(3, 1, 2));
		Collections.sort(stack);
		System.out.println("Stack can be sorted: " + stack);

		// 5) PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(2);
		System.out.println("PriorityQueue sorted by priority (natural order): " + pq);

		// 6) LinkedList (Queue)
		Queue<Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(1);
		queue.add(2);
		System.out.println("LinkedList as Queue cannot be directly sorted: " + queue);

		// 7) ArrayDeque
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(3);
		deque.add(1);
		deque.add(2);
		System.out.println("ArrayDeque cannot be sorted directly: " + deque);

		// 8) HashSet
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);
		System.out.println("HashSet cannot be sorted directly: " + hashSet);

		// 9) LinkedHashSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(3);
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		System.out.println("LinkedHashSet cannot be sorted directly: " + linkedHashSet);

		// 10) TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		System.out.println("TreeSet is always sorted: " + treeSet);
	}
}
