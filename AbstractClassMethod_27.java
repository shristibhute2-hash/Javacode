//WAP to demonstrate abstract class & method
//Abstract class => It can have abstract methods (methods without a body) and also normal methods.
package assignments;

//Abstract class
abstract class Shape {
	abstract void draw();// abstract method

	void display() // normal method
	{
		System.out.println("This is Shape");
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class AbstractClassMethod_27 {
	public static void main(String[] args) {
		Shape c = new Circle();

		c.display();
		c.draw();
		System.out.println("-------------------");
		Shape r = new Rectangle();

		r.display();
		c.draw();
	}

}
