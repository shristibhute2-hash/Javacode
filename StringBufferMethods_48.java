//WAP on StringBuffer methods
package assignments;

public class StringBufferMethods_48 {

	public static void main(String[] args) {
		// Create StringBuffer object
		StringBuffer sb = new StringBuffer("Automation");

		// 1 append() - adds text at the end
		sb.append(" Tester");
		System.out.println("After append(): " + sb);

		// 2️insert() - inserts text at specified index
		sb.insert(0, "Java ");
		System.out.println("After insert(): " + sb);

		// 3️ delete() - deletes characters from start index to end index
		sb.delete(5, 10); // deletes "mation"
		System.out.println("After delete(): " + sb);

		// 4️ replace() - replaces characters from start to end index
		sb.replace(5, 11, "Developer");
		System.out.println("After replace(): " + sb);

		// 5️ reverse() - reverses the entire string
		sb.reverse();
		System.out.println("After reverse(): " + sb);

	}

}
