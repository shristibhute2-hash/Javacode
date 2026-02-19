//WAP to check whether an Arraylist is empty or not
package assignments;

import java.util.ArrayList;

public class CheckArraylistEmptyorNot_65 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		if (list.isEmpty()) {
			System.out.println("ArrayList  is Empty");
		} else {
			System.out.println("ArrayList  is not Empty");
		}
		list.add("Shristi");
		if (list.isEmpty()) {
			System.out.println("ArrayList  is Empty");
		} else {
			System.out.println("ArrayList  is not Empty");
		}
	}

}
