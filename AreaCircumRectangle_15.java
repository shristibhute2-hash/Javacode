//WAP to calculate  area&cicumferance using scanner class for Rectangle
package assignments;

import java.util.Scanner;

public class AreaCircumRectangle_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of Rectangle");
		double length = sc.nextDouble();

		System.out.println("Enter the second side of Rectangle");
		double breadth = sc.nextDouble();

		// Calculate Area and circumference

		double circumference = 2 * (length + breadth);

		double area = length * breadth;

		// Displaying Results
		System.out.println("Area of Rectangle is  " + area);
		System.out.println("circumference of Rectangle is  " + circumference);

		sc.close();

	}

}
