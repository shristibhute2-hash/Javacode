//WAP to check if the given 2 Strings are Anagram
package assignments;

import java.util.Arrays;

public class AnagramString_44 {

	public static void main(String[] args) {
		String a = "silent";
		String b = "listen";
		if (a.length() != b.length()) {
			System.out.println("String is not anagram since length are not equal");
		} else {
			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();

			Arrays.sort(c1); // sort them alphabetically
			Arrays.sort(c2);

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			if (Arrays.equals(c1, c2)) { // compare the array
				System.out.println("It is Anagram");
			} else {
				System.out.println("It is  not Anagram");
			}
		}                  

}
}