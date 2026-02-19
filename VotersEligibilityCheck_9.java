package assignments;

//WAP to check person can vote only if he/she is 18 or above and should not vote if age is less

import java.util.Scanner;

public class VotersEligibilityCheck_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Voter's age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Person is eligible to vote");

		} else {
			System.out.println("Person is  not eligible to vote");
		}
		sc.close();
	}
}
                              