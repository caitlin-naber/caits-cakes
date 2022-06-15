import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Map;
import java.util.SimpleTimeZone;

public class OrderSystem {

    public DayOfWeek getDayOfTheWeek() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        return today;
    }
}
