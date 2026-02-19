//WAP on access specifier for methods 
package assignments;

class AB {

	// 1. public method
	public void publicMethod() {
		System.out.println("Public Method: Accessible everywhere");
	}

	// 2. protected method
	protected void protectedMethod() {
		System.out.println("Protected Method: Accessible in same package + subclasses");
	}

	// 3. default method (no keyword)
	void defaultMethod() {
		System.out.println("Default Method: Accessible only in same package");
	}

	// 4. private method
	private void privateMethod() {
		System.out.println("Private Method: Accessible only inside class AB");
	}

	// Method to show private method call
	public void callPrivate() {
		privateMethod();
	}
}

class BC extends AB {
	public void show() {
		System.out.println("\nInside Child Class B:");
		publicMethod();
		protectedMethod();
		defaultMethod();
		// privateMethod(); // ❌ Not allowed
		System.out.println("Private Method: NOT accessible in child class");
	}
}

public class AccessSpecifiersForMethods_29 {

	public static void main(String[] args) {

		AB objA = new AB();
		System.out.println("From Main Class:");

		objA.publicMethod(); // ✔ allowed
		objA.protectedMethod(); // ✔ allowed (same package)
		objA.defaultMethod(); // ✔ allowed (same package)
		objA.callPrivate(); // ✔ allowed (indirect access)
		// objA.privateMethod(); // ❌ NOT allowed (direct access denied)

		BC objB = new BC();
		objB.show(); // Shows which methods child can access
	}
}
