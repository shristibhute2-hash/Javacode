//WAP to establish primitive type casting
package assignments;

public class PrimitiveTypeCasting_110 {

	public static void main(String[] args) {

		// 🔹 Widening Type Casting (Automatic)
		byte b = 10;
		int i = b;
		double d = i;

		System.out.println("Widening Casting:");
		System.out.println("byte value: " + b);
		System.out.println("int value: " + i);
		System.out.println("double value: " + d);

		// 🔹 Narrowing Type Casting (Explicit)
		double x = 99.99;
		int y = (int) x;
		byte z = (byte) y;

		System.out.println("\nNarrowing Casting:");
		System.out.println("double value: " + x);
		System.out.println("int value: " + y);
		System.out.println("byte value: " + z);
	}
}
