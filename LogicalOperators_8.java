package assignments;

//WAP on logical operators with AND, OR, AND-NOT and Or-not

public class LogicalOperators_8 {

	public static void main(String[] args) {

		int age = 21;
		boolean isCitizen = true;

		if (age >= 18 && isCitizen) { // AND Operator
			System.out.println("Eligible to Vote");

		} else {
			System.out.println("Not Eligible to Vote");
		}

		if (age >= 18 && !isCitizen) { // NAND Operator
			System.out.println("Age is valid but not a citizen,can't vote");

		}
		if (age < 18 || !isCitizen) { // OR Operator
			System.out.println("one or more condition failed");
		}
		if (age >= 18 || !isCitizen) {
			System.out.println("Either eligible by age or not disqualified by citizenship.");
		}
	}
}