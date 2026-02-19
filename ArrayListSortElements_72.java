//WAP to sort the elements of ArrayList.
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortElements_72 {

	public static void main(String[] args) {
		 // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Selenium");
        list.add("Automation");
        list.add("Testing");
        list.add("API Testing");
        list.add("SQL");
        		

        System.out.println("Before sorting: " + list);

        // Sort ArrayList
        Collections.sort(list);  // It will sort alphabetically

        System.out.println("After sorting: " + list);

	}

}
