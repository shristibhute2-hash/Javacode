//WAP to check if average of all the values present in the array
package assignments;

public class AverageArray_38 {
	public static void main(String[] args) {
		double[] array = new double[4];
		array[0] = 20;
		array[1] = 45;
		array[2] = 30;
		array[3] = 60;
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			
		}
		avg = sum / array.length;
		System.out.println("Average of values present-> " + avg);

	}
}