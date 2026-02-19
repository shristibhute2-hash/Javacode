  //WAP to calculate  area &cicumferance using scanner class for Circle
package assignments;

import java.util.Scanner;

public class AreaCircumCircle_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		double radius = sc.nextDouble();
		
		//Calculate Area and circumference
		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;
		
		//Displaying Results
		System.out.println("Area of circle is  " + area);
		System.out.println("circumference of circle is  " + circumference);
		
		sc.close();
	}

}
