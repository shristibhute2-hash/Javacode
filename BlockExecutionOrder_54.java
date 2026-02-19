//Write a Java program to demonstrate the order of execution of Static Initialization Block (SIB), Instance Initialization Block (IIB), main() method, and Constructor
package assignments;

public class BlockExecutionOrder_54 {
	static {
		System.out.println("SIB");
	}

	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}

	BlockExecutionOrder_54() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		BlockExecutionOrder_54 b1 = new BlockExecutionOrder_54();

	}

}
