//WAP on Interface
package assignments;

//Interface
interface Animal {
 void sound();     // abstract method
 void eat();       // abstract method
}

//Child class implementing interface
class Dog implements Animal {

 public void sound() {
     System.out.println("Dog barks");
 }

 public void eat() {
     System.out.println("Dog eats bones");
 }
}

//Main class
public class Interface_28 {
 public static void main(String[] args) {
     
	 Dog obj = new Dog();  
     
     obj.sound();
     obj.eat();
 }
}
