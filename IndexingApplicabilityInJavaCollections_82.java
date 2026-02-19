/*Check whether indexing is applicable for following or not.
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

public class IndexingApplicabilityInJavaCollections_82 {

	public static void main(String[] args) {
		// 1) ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		System.out.println("ArrayList indexing applicable: " + arrayList.get(0));

		// 2) LinkedList (as List)
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("B");
		System.out.println("LinkedList (List) indexing applicable: " + linkedList.get(0));

		// 3) Vector
		Vector<String> vector = new Vector<>();
		vector.add("C");
		System.out.println("Vector indexing applicable: " + vector.get(0));

		// 4) Stack
		Stack<String> stack = new Stack<>();
		stack.push("D");
		System.out.println("Stack indexing applicable: " + stack.get(0));

		// 5) PriorityQueue
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("E");
		System.out.println("PriorityQueue indexing applicable: NO (get() not available)");

		// 6) LinkedList as Queue
		Queue<String> queue = new LinkedList<>();
		queue.add("F");
		System.out.println("LinkedList (Queue) indexing applicable: NO");

		// 7) ArrayDeque
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.add("G");
		System.out.println("ArrayDeque indexing applicable: NO");

		// 8) HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("H");
		System.out.println("HashSet indexing applicable: NO");

		// 9) LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("I");
		System.out.println("LinkedHashSet indexing applicable: NO");

		// 10) TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("J");
		System.out.println("TreeSet indexing applicable: NO");
	}

}
