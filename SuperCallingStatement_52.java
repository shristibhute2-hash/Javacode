//WAP on super() calling statement
package assignments;

class SuperClass1 {

	SuperClass1() {
		System.out.println("Parent class constructor");
	}
}

class SubClass extends SuperClass1 {

	SubClass() {
		super(); // calls Parent class constructor
		System.out.println("Child class constructor");
	}
}

public class SuperCallingStatement_52 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
	}
}
