//WAP on how to generate the hashcode value
package assignments;

class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class GenerateHashCodeValue_106 {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "John");
		Employee e2 = new Employee(101, "John");

		System.out.println("HashCode of e1: " + e1.hashCode());
		System.out.println("HashCode of e2: " + e2.hashCode());
	}
}
