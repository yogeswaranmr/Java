package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    static void main() {
        //getting date with time
        var dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // formatting
        var myFormat = DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm:ss");
        String formattedDateTime = dateTime.format(myFormat);

        System.out.println("After formatting: " + formattedDateTime);
    }
}
