//Write a program on +,-,*,/ and % operators
package assignments;

//Write a program on +,-,*,/ and % operators

public class ArithmeticOperators_4 {
	
	static void add() {
		int a = 10;
		int b = 30;
		int c =a+b;
		System.out.println("Result is "+c);
	}
	static void sub() {
		int a = 10;
		int b = 30;
		int c =a+b;
		System.out.println("Result is "+c);
	}
	static void mul() {
		int a = 60;
		int b = 3;
		int c =a*b;
		System.out.println("Result is "+c);
	}
	static void div() {
		int a = 90;
		int b = 30;
		int c =a/b;
		System.out.println("Result is "+c);
	}
	static void mod() {
		int a = 110;
		int b = 30;
		int c = a%b;
		System.out.println("Result is "+c);
	}

	public static void main(String[] args) {
		add();// calling static methods
		sub();
		mul();
		div();
		mod();

	}

}
//increment i++ and decrement i-- are pending