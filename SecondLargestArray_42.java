//WAP to find 2nd largest array

package assignments;

import java.util.Scanner;

public class SecondLargestArray_42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest Element is : " + secondLargest);
	}

}
