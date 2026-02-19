//WAP to calculate  area&cicumferance using scanner class for square
 
package assignments;

import java.util.Scanner;

public class AreaCircumSquare_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square");
		double side = sc.nextDouble();

		// Calculate Area and circumference
		double area = side * side;
		double circumference = 4 * side;

		// Displaying Results
		System.out.println("Area of Square is  " + area);
		System.out.println("circumference of Square is  " + circumference);

		sc.close();
	}

}
