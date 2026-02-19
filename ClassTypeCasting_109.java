//WAP to establish class type casting
package assignments;

//Parent class
class Supper {
	void show() {
		System.out.println("This is Parent class method");
	}
}

//Child class
class Subbclass extends Supper {
	void display() {
		System.out.println("This is Child class method");
	}

}

public class ClassTypeCasting_109 {

	public static void main(String[] args) {

		// 🔹 Upcasting (Implicit)
		Supper p = new Subbclass(); // Parent reference, Child object
		p.show(); // Allowed

		// 🔹 Downcasting (Explicit)
		Subbclass c = (Subbclass) p; // Explicit casting
		c.display(); // Allowed
		c.show(); // Parent method
	}
}
