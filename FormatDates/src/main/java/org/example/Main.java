package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args)
    {
        // Get the current date and time in GMT time zone
        LocalDateTime currentTime = LocalDateTime.now(TimeZone.getTimeZone("GMT").toZoneId());

        // Create a date format pattern "MM/dd/yyyy"
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String fullDate = currentTime.format(formattingDate); //store it in fullDate variable and print out

        DateTimeFormatter updatedFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String newFormattedDate = currentTime.format(updatedFormat);

        DateTimeFormatter monthInWords = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String monInWords = currentTime.format(monthInWords);

        // Create a date format pattern with day of the week, month in words, and time
        DateTimeFormatter dayInWeek = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        String dayInWeekWithMonInWords = currentTime.format(dayInWeek); //"Friday, Oct 20, 2023 05:40" - ex

        // Print the formatted date and time strings
        System.out.println(fullDate);
        System.out.println(newFormattedDate);
        System.out.println(monInWords);
        System.out.println(dayInWeekWithMonInWords);

        //Challenge, display in your local Time Zone
        LocalDateTime currentTimeForBonus = LocalDateTime.now(); //
        DateTimeFormatter bonusFormat = DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy");
        System.out.println(currentTimeForBonus.format(bonusFormat));
    }
}
