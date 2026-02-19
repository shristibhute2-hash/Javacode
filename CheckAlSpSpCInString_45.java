//WAP to check the number of char present in the given String,alphabets present,special char present and spaces present
//It checks in given String wheathe it is alphabet, numeric or Space for each index (o/p of last index)
package assignments;

public class CheckAlSpSpCInString_45 {

	public static void main(String[] args) {
		String input = "I am Automation Tester";
		char[] c1 = input.toCharArray();

		for (int i = 0; i < c1.length; i++) {
			System.out.println("For index-> " + i);
			boolean b1 = Character.isAlphabetic(c1[i]);
			System.out.println("Alphabet-> " + b1);
			boolean b2 = Character.isDigit(c1[i]);
			System.out.println("Numeric-> " + b2);
			boolean b3 = Character.isWhitespace(c1[i]);
			System.out.println("Space-> " + b3);
			System.out.println("============");
		}

	}

}
