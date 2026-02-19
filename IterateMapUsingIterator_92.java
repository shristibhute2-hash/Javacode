//WAP to iterate both Key and Value of a Map using iterator method
package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMapUsingIterator_92 {

	public static void main(String[] args) {

		// Create Map
		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Java");
		map.put(102, "Selenium");
		map.put(103, "Automation");

		// Convert Map to Set
		Set<Map.Entry<Integer, String>> set = map.entrySet();

		// Create Iterator
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();

		// Iterate Map
		System.out.println("Key and Value using Iterator:");
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
