//WAP to fetch values of a Map one by one
package assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FetchValuesOnebyOne_90 {

	public static void main(String[] args) {
		// Create Map
		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Java");
		map.put(102, "Selenium");
		map.put(103, "Automation");

		// Fetch values one by one
		Collection<String> values = map.values();
		Iterator<String> itr = values.iterator();

		System.out.println("Values of the Map:");
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);

		}

	}
}