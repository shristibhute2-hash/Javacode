//WAP to check if two arrays are equal
package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArraysAreEqual_37 {
	public static void main(String[] args) {
		int array1[] = new int[4];
		array1[0] = 100;
		array1[1] = 120;
		array1[2] = 500;
		array1[3] = 540;

		int array2[] = new int[array1.length];
		array2[0] = 100;
		array2[1] = 120;
		array2[2] = 500;
		array2[3] = 540;

		//boolean b1 = Arrays.equals(array1, array2);

		if (Arrays.equals(array1, array2) == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are NOT equal");
		}

	}
}
