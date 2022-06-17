import org.junit.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FileReaderTest {
    private FileReader fileReader;
    private DayOfWeek dayOfWeek;

    @Before
    public void setup() {
        fileReader = new FileReader();
        dayOfWeek = LocalDateTime.now().getDayOfWeek();

    }

    // getDayOfWeek
    // getTodaysFileName
    // menuFileReader
    // getTodaysMenu
    // createCakeFromLine

    @Test
    public void get_today_for_day_of_week() {
        // Arrange
        String expectedResult = String.valueOf(dayOfWeek);
        // Act
        String actualResult = fileReader.getDayOfTheWeek();
        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void get_thursdays_menu_from_file() {
        // Arrange
        String expectedResult = "MenuThursday";
        // Act
        String actualResult = fileReader.getFileNameFromDayOfWeek("THURSDAY");
        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    // todo: figure out how to make it not dependent on day of week
    @Test
    public void get_items_for_thursdays_menu() {
        // Arrange
        Cake deathByChocolate = new Cake("Death by Chocolate", "chocolate cake",
                "black cocoa buttercream","dark chocolate ganache", "chocolate drizzle");
        Cake birthdayCake = new Cake("Birthday Cake", "yellow butter cake",
                "chocolate buttercream", "none", "rainbow sprinkles and a single candle");
        Map<String, Cake> expectedMap = new HashMap<>();
        expectedMap.put(deathByChocolate.getName(), deathByChocolate);
        expectedMap.put(birthdayCake.getName(), birthdayCake);
        // Act
        Map<String, Cake> actualMap = fileReader.getTodaysMenu();
        // Assert
        Assert.assertEquals(expectedMap, actualMap);
    }
}
