//Call Static Methods inside the main method
package assignments;

//Call Static Methods inside the main method

public class CallStaticMethodInsideMainMethod_3 {
	static void add() {
		System.out.println("static method 1");
	}

	static void sub() {
		System.out.println("static method 2");
	}

	public static void main(String[] args) {
		System.out.println("calling static method inside main method");
		add();
		sub();
	}

}
