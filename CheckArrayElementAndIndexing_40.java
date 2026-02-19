//WAP to check if 100 is a part of the Array and diaplay its indexing
package assignments;

public class CheckArrayElementAndIndexing_40 {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 96;
		array[2] = 100;
		array[3] = 40;
		int numberToCheck = 100;
		for (int i = 0; i < array.length; i++) {
			if (numberToCheck == array[i]) {
				System.out.println("Yes 100 is a part of The Given Array");
				System.out.println("The index of 100 is ->" + i);
			}
		}
	}
}
