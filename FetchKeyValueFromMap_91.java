//WAP to fetch both Key and Value of a Map one by one.
package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FetchKeyValueFromMap_91 {

	public static void main(String[] args) {

		// Create Map
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "Automation");

		// Fetch keys and values one by one
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entries.iterator();

		System.out.println("Key and Value of Map:");
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
