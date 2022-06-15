import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderSystem {

    public String getDayOfTheWeek() {
        DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
        String today = String.valueOf(dayOfWeek);
        return today;
    }

    // todo: should this be a switch statement
    public String getTodaysFileName() {
        String today = getDayOfTheWeek();
        String todaysFileName = "";
         if (today.equals("WEDNESDAY")) {
            todaysFileName = "MenuWednesday";
        } else if (today.equals("THURSDAY")) {
            todaysFileName = "MenuThursday";
        } else if (today.equals("FRIDAY")) {
            todaysFileName = "MenuFriday";
        } else if (today.equals("SATURDAY")) {
            todaysFileName = "MenuSaturday";
        } else if (today.equals("SUNDAY")) {
            todaysFileName = "MenuSunday";
        } else {
             System.out.println("Sorry, we're closed today. Please come back another day!");
         }
        return todaysFileName;
    }
}
