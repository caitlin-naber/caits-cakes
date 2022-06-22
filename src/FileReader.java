import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    private String menuFileName;


    public String getDayOfTheWeek() {
        DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
        String today = String.valueOf(dayOfWeek);
        return today;
    }

    public String getFileNameFromDayOfWeek(String dayOfWeek) {
        String todaysFileName = "";
        switch (dayOfWeek) {
            case "WEDNESDAY":
                todaysFileName = "MenuWednesday";
                break;
            case "THURSDAY":
                todaysFileName = "MenuThursday";
                break;
            case "FRIDAY":
                todaysFileName = "MenuFriday";
                break;
            case "SATURDAY":
                todaysFileName = "MenuSaturday";
                break;
            case "SUNDAY":
                todaysFileName = "MenuSunday";
                break;
            default:
                System.out.println("Sorry, we're closed today. Please come back another day!");
                break;
        }
        return todaysFileName;
    }

    // read from file and return a map of menu items (cakes)
    public Map<String, Cake> getTodaysMenu() {
        Map<String, Cake> menuItems = new HashMap<>();
        File file = new File(getFileNameFromDayOfWeek(getDayOfTheWeek()));

        try(Scanner fileScanner = new Scanner(file)) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Cake lineFromFile = createCakeFromLine(line);
                menuItems.put(lineFromFile.getName(), lineFromFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return menuItems;
    }
    
    // given a line, pull the parts of a Cake object
    public Cake createCakeFromLine(String line) {
        String[] lineComponents = line.split("\\|");
        String cakeName = lineComponents[0];
        String cakeType = lineComponents[1];
        String frostingType = lineComponents[2];
        String filling = lineComponents[3];
        String decoration = lineComponents[4];

        Cake menuItem = new Cake(cakeName, cakeType, frostingType, filling, decoration);
        return menuItem;
    }
}
