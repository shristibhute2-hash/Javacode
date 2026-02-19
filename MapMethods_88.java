/*WAP on map using below methods.
1).put (K,V)
2).putifabsent
3)putall
4).equal
5).remove(K)
6).remove(K,V)
7).replace(K)
8).replace(K,oldvalue,newValue)
9)containsKey
10)containsValue
11)putAll(Map)
12).size()
13).get(object)*/
package assignments;

import java.util.HashMap;
import java.util.Map;

public class MapMethods_88 {

	public static void main(String[] args) {

		// Create Map
		Map<Integer, String> map1 = new HashMap<>();

		// 1) put(K, V)
		map1.put(1, "Java");
		map1.put(2, "Selenium");
		map1.put(3, "Automation");
		System.out.println("After put(): " + map1);

		// 2) putIfAbsent(K, V)
		map1.putIfAbsent(2, "Testing"); // will not replace
		map1.putIfAbsent(4, "Testing"); // will add
		System.out.println("After putIfAbsent(): " + map1);

		// 3) putAll(Map)
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(5, "API");
		map2.put(6, "Framework");

		map1.putAll(map2);
		System.out.println("After putAll(): " + map1);

		// 4) equals(Object o)
		Map<Integer, String> map3 = new HashMap<>(map1);
		System.out.println("map1 equals map3? " + map1.equals(map3));

		// 5) remove(K)
		map1.remove(6);
		System.out.println("After remove(K): " + map1);

		// 6) remove(K, V)
		map1.remove(5, "API");
		System.out.println("After remove(K, V): " + map1);

		// 7) replace(K, V)
		map1.replace(1, "Core Java");
		System.out.println("After replace(K, V): " + map1);

		// 8) replace(K, oldValue, newValue)
		map1.replace(2, "Selenium", "UI Automation");
		System.out.println("After replace(K, oldV, newV): " + map1);

		// 9) containsKey(Object key)
		System.out.println("Contains key 3? " + map1.containsKey(3));

		// 10) containsValue(Object value)
		System.out.println("Contains value 'Testing'? " + map1.containsValue("Testing"));

		// 12) size()
		System.out.println("Size of map: " + map1.size());

		// 13) get(Object key)
		System.out.println("Value for key 1: " + map1.get(1));
	}
}
