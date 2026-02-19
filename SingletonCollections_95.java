/*  	
WAP on Collections using below methods.

a)singleton()
b)singletonMap()
c)singletonList()*/

package assignments;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingletonCollections_95 {

    public static void main(String[] args) {

        // a) singleton()
        Set<String> singleSet = Collections.singleton("Java");
        System.out.println("Singleton Set: " + singleSet);

        // b) singletonList()
        List<Integer> singleList = Collections.singletonList(100);
        System.out.println("Singleton List: " + singleList);

        // c) singletonMap()
        Map<Integer, String> singleMap = Collections.singletonMap(1, "Selenium");
        System.out.println("Singleton Map: " + singleMap);

        // Trying modification (will throw exception)
        // singleList.add(200);        // UnsupportedOperationException
        // singleSet.add("Python");    // UnsupportedOperationException
        // singleMap.put(2, "TestNG"); // UnsupportedOperationException
    }
}
