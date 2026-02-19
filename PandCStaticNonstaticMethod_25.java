//WAP on Child class and Parent class: 2 static method and 2 non static methods and calling in main method
package assignments;

class Parent1 {
	// ----------- Static Methods -----------
	static void parentStatic1() {
		System.out.println("Parent Static Method 1");
	}

	static void parentStatic2() {
		System.out.println("Parent Static Method 2");
	}

	// ----------- Non-Static Methods -----------
	void parentNonStatic1() {
		System.out.println("Parent Non-Static Method 1");
	}

	void parentNonStatic2() {
		System.out.println("Parent Non-Static Method 2");
	}
}

class Child1 extends Parent1 {
	// ----------- Static Methods -----------
	static void childStatic1() {
		System.out.println("child Static Method 1");
	}

	static void childStatic2() {
		System.out.println("child Static Method 2");
	}

	// ----------- Non-Static Methods -----------
	void childNonStatic1() {
		System.out.println("child Non-Static Method 1");
	}

	void childNonStatic2() {
		System.out.println("child Non-Static Method 2");
	}
}

public class PandCStaticNonstaticMethod_25 {

	public static void main(String[] args) {

		// Calling Parent static methods (calling static method by class name)
		Parent1.parentStatic1();
		Parent1.parentStatic2();

		// Calling Child static methods
		Child1.childStatic1();
		Child1.childStatic2();

		// Creating Child object to call non-static methods
		Child1 obj = new Child1();

		// Parent non-static methods
		obj.parentNonStatic1();
		obj.parentNonStatic2();

		// Child non-static methods
		obj.childNonStatic1();
		obj.childNonStatic2();
	}

}
