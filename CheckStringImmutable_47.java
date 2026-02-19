//Wap to check string are immutable&muttable by using stringbuffer and builder

package assignments;

public class CheckStringImmutable_47 {

	public static void main(String[] args) {

        // ----------- String (Immutable) -----------
        String s = "Automation";
        System.out.println("String before concat: " + s);

        s.concat(" Tester");   // creates new object, original not changed
        System.out.println("String after concat: " + s);

        // ----------- StringBuffer (Mutable) -----------
        StringBuffer sb = new StringBuffer("Automation");
        System.out.println("\nStringBuffer before append: " + sb);

        sb.append(" Tester");  // modifies same object
        System.out.println("StringBuffer after append: " + sb);

        // ----------- StringBuilder (Mutable) -----------
        StringBuilder sb1 = new StringBuilder("Automation");
        System.out.println("\nStringBuilder before append: " + sb1);

        sb1.append(" Tester"); // modifies same object
        System.out.println("StringBuilder after append: " + sb1);

	}

}
