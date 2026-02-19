//WAP to store Key and Value in a Map.
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Map_87 {

	public static void main(String[] args) {
		// Create Map
		Map<Integer, String> map = new HashMap<>();

		// Store key-value pairs
		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "Automation");
		map.put(4, "Testing");
		map.put(5, "Manual Testing");
		map.put(6, "SQL");

		// Print Map
		System.out.println("Map elements are:");
		System.out.println(map);
	}
}