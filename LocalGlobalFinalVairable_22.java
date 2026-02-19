//WAP on Local Variable,Global variable,final variable
package assignments;

public class LocalGlobalFinalVairable_22 {

	int instancevar = 10; // Global instance vairiable
	static String staticVar = "Hello Shristi";// Static Global vairables

	public void show() {
		int localVar = 90; // local varaible
		System.out.println("Local vairable is " + localVar);

		System.out.println(" Instance Global variable  " + instancevar);
		System.out.println(" static Global variable  " + staticVar);

		final int finalVar = 100; // final variable value can't be changed
		System.out.println("final vairable = " + finalVar);
	}

	public static void main(String[] args) {
		LocalGlobalFinalVairable_22 obj = new LocalGlobalFinalVairable_22();// obj creation for calling Global vmethod
		obj.show();

	}

}
