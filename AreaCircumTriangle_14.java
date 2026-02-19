//WAP to calculate  area &cicumferance using scanner class for Triangle
package assignments;

import java.util.Scanner;

public class AreaCircumTriangle_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of Triangle");
		double side1 = sc.nextDouble();

		System.out.println("Enter the second side of Triangle");
		double side2 = sc.nextDouble();

		System.out.println("Enter the third side of Triangle");
		double side3 = sc.nextDouble();

		// Calculate Area and circumference

		double circumference = side1 + side2 + side3;
		double s = circumference / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// Displaying Results
		System.out.println("Area of Triangle is  " + area);
		System.out.println("circumference of Triangle is  " + circumference);

		sc.close();

	}

}
