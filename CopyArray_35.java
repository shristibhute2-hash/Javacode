//WAP to copy the value of one array into another
package assignments;

import java.util.Arrays;


public class CopyArray_35 {
	public static void main(String[] args) {
		int array1[] = new int[3];
		array1[0] = 89;
		array1[1] = 98;
		array1[2] = 87;

		int array2[] = new int[array1.length];

		for (int i = 0, j = 0; i < array1.length; i++, j++) {
			array2[j] = array1[i];
		}
		System.out.print("Inout Array:->");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output Array:->");
		System.out.println(Arrays.toString(array2));

	}
}
