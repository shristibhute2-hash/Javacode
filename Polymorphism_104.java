//WAP on Polymorphism

package assignments;

//Parent class
class Bird {

	// Method Overriding (Run-time polymorphism)
	void sound() {
		System.out.println("Birds makes a sound");
	}

	// Method Overloading (Compile-time polymorphism)
	void eat() {
		System.out.println("Birds eats food");
	}

	void eat(String food) {
		System.out.println("Birds eats " + food);
	}
}

//Child class
class Parrot extends Bird {

	void sound() {
		System.out.println("parrot speaks");
	}
}

//Main class
public class Polymorphism_104 {

	public static void main(String[] args) {

		// Run-time polymorphism
		Bird a = new Parrot(); // Parent reference, child object
		a.sound(); // Calls Dog's sound()

		// Compile-time polymorphism
		a.eat();
		a.eat("Bones");
	}
}
