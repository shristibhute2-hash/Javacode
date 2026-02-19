//WAP Check whether following accepts null or not. 1)ArrayList 2)LinkedList 3)Vector 4)Stack 5)PriorityQueue 6)LinkedList(Queue) 7)ArrayDeque 8)HashSet 9)LinkedHashSet 10)TreeSet
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

public class NullAcceptanceInColections_84 {

	public static void main(String[] args) {

		// 1) ArrayList
		try {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add(null);
			System.out.println("ArrayList allows null: " + arrayList);
		} catch (Exception e) {
			System.out.println("ArrayList does NOT allow null");
		}

		// 2) LinkedList
		try {
			LinkedList<String> linkedList = new LinkedList<>();
			linkedList.add(null);
			System.out.println("LinkedList allows null: " + linkedList);
		} catch (Exception e) {
			System.out.println("LinkedList does NOT allow null");
		}

		// 3) Vector
		try {
			Vector<String> vector = new Vector<>();
			vector.add(null);
			System.out.println("Vector allows null: " + vector);
		} catch (Exception e) {
			System.out.println("Vector does NOT allow null");
		}

		// 4) Stack
		try {
			Stack<String> stack = new Stack<>();
			stack.push(null);
			System.out.println("Stack allows null: " + stack);
		} catch (Exception e) {
			System.out.println("Stack does NOT allow null");
		}

		// 5) PriorityQueue
		try {
			PriorityQueue<String> pq = new PriorityQueue<>();
			pq.add(null);
			System.out.println("PriorityQueue allows null: " + pq);
		} catch (Exception e) {
			System.out.println("PriorityQueue does NOT allow null");
		}

		// 6) LinkedList as Queue
		try {
			Queue<String> queue = new LinkedList<>();
			queue.add(null);
			System.out.println("LinkedList (Queue) allows null: " + queue);
		} catch (Exception e) {
			System.out.println("LinkedList (Queue) does NOT allow null");
		}

		// 7) ArrayDeque
		try {
			ArrayDeque<String> deque = new ArrayDeque<>();
			deque.add(null);
			System.out.println("ArrayDeque allows null: " + deque);
		} catch (Exception e) {
			System.out.println("ArrayDeque does NOT allow null");
		}

		// 8) HashSet
		try {
			HashSet<String> hashSet = new HashSet<>();
			hashSet.add(null);
			System.out.println("HashSet allows null: " + hashSet);
		} catch (Exception e) {
			System.out.println("HashSet does NOT allow null");
		}

		// 9) LinkedHashSet
		try {
			LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add(null);
			System.out.println("LinkedHashSet allows null: " + linkedHashSet);
		} catch (Exception e) {
			System.out.println("LinkedHashSet does NOT allow null");
		}

		// 10) TreeSet
		try {
			TreeSet<String> treeSet = new TreeSet<>();
			treeSet.add(null);
			System.out.println("TreeSet allows null: " + treeSet);
		} catch (Exception e) {
			System.out.println("TreeSet does NOT allow null");
		}
	}
}