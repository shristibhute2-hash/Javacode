//Write a program on Switch Case
package assignments;

import java.util.Scanner;

public class SwitchCase_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter valid number from 1 to 7 as days of week");
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Satarday");
			break;
		default:
			System.out.println("Enter valid input");
		}
		sc.close();
	}

}
