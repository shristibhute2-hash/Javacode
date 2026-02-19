//WAP to fetch keys of a map one by one.
package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FetchKeysOnebyOne_89 {

	public static void main(String[] args) {
		// Create Map
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "Automation");

		// Fetch keys one by one
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();

		System.out.println("Keys of the Map:");
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key);
		}
	}

}
