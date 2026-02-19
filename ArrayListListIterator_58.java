       //Write a Java program to iterate an ArrayList using ListIterator

//(Forward and backward traversal)

package assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator_58 {

	public static void main(String[] args) {
		  // Create ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("Automation");
        list.add("Testing");

        // Get ListIteratorm,.
        ListIterator<String> listItr = list.listIterator();

        //  Forward direction iteration
        System.out.println("Forward Direction:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        //  Backward direction iteration
        System.out.println("\nBackward Direction:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

	}

}
