//WAP on String split(), concat(), String buffer append()

package assignments;

public class StringMethods_46 {

	public static void main(String[] args) {
		// ----------- String.split() -----------
		String input = "I am an Automation Tester";
		System.out.println("Original String: " + input);

		String[] words = input.split(" ");
		System.out.println("\nUsing split():");
		for (String word : words) {
			System.out.println(word);
		}

		// ----------- String.concat() -----------
		String s1 = "Automation";
		String s2 = "Tester";

		String concatResult = s1.concat(" ").concat(s2);
		System.out.println("\nUsing concat():");
		System.out.println(concatResult);

		// ----------- StringBuffer.append() -----------
		StringBuffer sb = new StringBuffer("Automation");
		sb.append(" ");
		sb.append("Tester");

		System.out.println("\nUsing StringBuffer.append():");
		System.out.println(sb);

	}

}
