//WAP to copy the value of one array into another in reverse order
package assignments;

import java.util.Arrays;

public class CopyArrayReverseOrder_43 {

	public static void main(String[] args) {

		int array1[] = new int[4];
		array1[0] = 789;
		array1[1] = 123;
		array1[2] = 456;
		array1[3] = 987;

		int array2[] = new int[array1.length];

		for (int i = 0, j = array2.length - 1; i < array1.length; i++, j--) {
			array2[j] = array1[i];

		}
		System.out.print("Inout Array:->");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output Array:->");
		System.out.println(Arrays.toString(array2));
	}

}
