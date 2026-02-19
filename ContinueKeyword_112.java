//WAP using Continue Keyword
//continue is used inside loops to skip the current iteration and move to the next iteration.
package assignments;

public class ContinueKeyword_112 {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 5) {
			i++;

			if (i == 3) {
				continue;
			}

			System.out.println(i);
		}
	}
}
