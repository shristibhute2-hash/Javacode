//WAP on super calling and this calling statement in constructor
// this() one construcor cALLING ANOTHER CONSTRUCTOR OF SAME CLASS
// SUPER() USE TO CALL PARENT CLASS CONSTRUTOR
package assignments;

class ParentClass {

	ParentClass() {
		System.out.println("Parent class constructor (using super())");
	}
}

class Childclass extends ParentClass {

	Childclass() {
		this(1000); // calls Child(int) constructor
		System.out.println("Child class default constructor");
	}

	Childclass(int x) {
		super(); // calls Parent constructor
		System.out.println("Child class parameterized constructor, value = " + x);
	}
}

public class SuperThisCallingStatement_24 {

	public static void main(String[] args) {

		Childclass obj = new Childclass();
	}
}
