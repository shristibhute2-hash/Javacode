//WAP on this() calling

//one constructor calling another constructor within class
package assignments;

public class ThisCallingStatement_51 {
	ThisCallingStatement_51() {
		this(100);
		System.out.println("This is Constructor 1");
	}

	ThisCallingStatement_51(int a) {
		this("Ram");
		System.out.println("This is Constructor 2");
	}

	ThisCallingStatement_51(String a) {
		this('X');
		System.out.println("This is Constructor 3");
	}

	ThisCallingStatement_51(char a) {
		System.out.println("This is Constructor 4");
	}

	ThisCallingStatement_51(boolean a, String b) {
		this();
		System.out.println("This is Constructor 5");
	}

	public static void main(String[] args) {
		new ThisCallingStatement_51(true, "Selenium");
	}

}
