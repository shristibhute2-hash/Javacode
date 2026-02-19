     //WAP to enter the value of Array at run time
package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRunTime_34 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements:");

		// Taking input at runtime
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Display array
		// System.out.println("Array elements are:"+Arrays.toString(arr));
		for (int i = 0; i < size; i++) {

		}
		System.out.println("Array Elements are" + Arrays.toString(arr));
	}
}