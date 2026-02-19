//WAP to check to find out present time,future time and past time
package assignments; 
import java.util.Date;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckPastPresentFutureTime_30 {
    public static void main(String[] args) {

        // Current time
        LocalDateTime presentTime = LocalDateTime.now();
        System.out.println("Present Time: " + presentTime);

        // Create a past time (10 days ago)
        LocalDateTime pastTime = presentTime.minusDays(10);

        // Create a future time (5 days later)
        LocalDateTime futureTime = presentTime.plusDays(5);

        // Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\nPast Time   : " + pastTime.format(dtf));
        System.out.println("Future Time : " + futureTime.format(dtf));
        System.out.println();

        // Compare
        checkTime(pastTime, presentTime);
        checkTime(futureTime, presentTime);
        checkTime(presentTime, presentTime);
    }

    static void checkTime(LocalDateTime inputTime, LocalDateTime currentTime) {

        if (inputTime.isBefore(currentTime)) {
            System.out.println(inputTime + "  ==> PAST time");
        } 
        else if (inputTime.isAfter(currentTime)) {
            System.out.println(inputTime + "  ==> FUTURE time");
        } 
        else {
            System.out.println(inputTime + "  ==> PRESENT time");
        }
    }
}
