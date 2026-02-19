//WAP overload both methods[static and non-static] and the constructor in a single program

package assignments;

public class OverloadS_NS_Cons_11 {
	// Overloading constructor
	OverloadS_NS_Cons_11() {
		System.out.println("Default Constructor");
	}

	OverloadS_NS_Cons_11(String name) {
		System.out.println("Parametrized Constructor with String "+name);
	}

	// overloading Nonstatic methods
	void display() {
		System.out.println("Displaying Non static Methods with no parameters");
	}

	void display(String name) {
		System.out.println("Displaying Non static Methods with  parameters "+name);
	}

	// Overloading Static methods
	static void get() {
		System.out.println("Displaying  static Methods with no parameters");
	}

	static void get(int a) {
		System.out.println("Displaying  static Methods with no parameters " +a);
	}

	public static void main(String[] args) {
		OverloadS_NS_Cons_11 c1 = new OverloadS_NS_Cons_11(); // constructor Overloading
		OverloadS_NS_Cons_11 c2 = new OverloadS_NS_Cons_11("Shristi"); // constructor Overloading
		c1.display(); // calling Non static Methods 
		c2.display("Sakshi");//calling Non static Methods 
		get();//calling  static Methods 
		get(100);//calling  static Methods 

	}

}
