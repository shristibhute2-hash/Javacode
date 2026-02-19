//WAP on Collections using below methods.

//a)min()
//b)max()
//c)frequency()
//d)sort()
//e)reverse()
//f)shuffle()
//g)binarySearch()
//h)rotate()
//i)disjoint()
//j)copy()
//k)replaceAll()
//l)fill()

package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods_94 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);

		System.out.println("Original List: " + list);

		// a) min()
		System.out.println("Min Element: " + Collections.min(list));

		// b) max()
		System.out.println("Max Element: " + Collections.max(list));

		// c) frequency()
		System.out.println("Frequency of 20: " + Collections.frequency(list, 20));

		// d) sort()
		Collections.sort(list);
		System.out.println("After Sorting: " + list);

		// e) reverse()
		Collections.reverse(list);
		System.out.println("After Reverse: " + list);

		// f) shuffle()
		Collections.shuffle(list);
		System.out.println("After Shuffle: " + list);

		// g) binarySearch() (list must be sorted)
		Collections.sort(list);
		int index = Collections.binarySearch(list, 30);
		System.out.println("Binary Search of 30: Index = " + index);

		// h) rotate()
		Collections.rotate(list, 2);
		System.out.println("After Rotate by 2: " + list);

		// i) disjoint()
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		System.out.println("Disjoint Check: " + Collections.disjoint(list, list2));

		// j) copy()
		List<Integer> dest = new ArrayList<>();
		dest.add(0);
		dest.add(0);
		dest.add(0);
		dest.add(0);
		dest.add(0);

		Collections.copy(dest, list);
		System.out.println("After Copy: " + dest);

		// k) replaceAll()
		Collections.replaceAll(list, 20, 99);
		System.out.println("After replaceAll(20 -> 99): " + list);

		// l) fill()
		Collections.fill(list, 5);
		System.out.println("After Fill: " + list);
	}
}
