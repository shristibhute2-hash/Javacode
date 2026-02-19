//WAP on matches and replaceAll methods
package assignments;


public class MatchesReplaceAllMethods_31 {
    public static void main(String[] args) {

        String data = "Java123";

        // matches() → checking if string contains only digits
        System.out.println("Only digits? " + data.matches("[0-9]+"));

        // replaceAll() → remove all digits
        String newData = data.replaceAll("[0-9]", "");
        System.out.println("After removing digits: " + newData);
    }
}
