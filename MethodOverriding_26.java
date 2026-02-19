
//WAP to demonstrate Method Overriding
//Same method name and signature in both parent and child class but with different implementation
package assignments;

class vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}

class Car extends vehicle {
	void run() {
		System.out.println("Car is running");
	}
}

public class MethodOverriding_26 {

	public static void main(String[] args) {
		vehicle v1 = new vehicle(); // Calls parent method

		v1.run();

		vehicle v2 = new Bike(); // Calls Bike's overridden method
		v2.run();

		vehicle v3 = new Car(); // Calls Car's overridden method
		v3.run();
	}
}