/*//WAP to demonstrate different JVM memory.

1)Stack Memory
2)Heap Memomory
3)Method Area
4)PC registerWAP to demonstrate different JVM memory.*/
package assignments;

public class JVMMemory_96 {

	// Method Area (Class-level variables & methods)
	static int staticVar = 100;

	public static void main(String[] args) {

		// Stack Memory (local variables & method calls)
		int localVar = 50;
		System.out.println("Local Variable (Stack): " + localVar);

		// Heap Memory (objects)
		JVMMemory_96 obj = new JVMMemory_96();
		obj.display();

		// PC Register (implicitly handled by JVM)
		// JVM stores the address of current instruction being executed
	}

	void display() {
		int methodVar = 25; // Stack Memory
		System.out.println("Method Variable (Stack): " + methodVar);
	}
}
