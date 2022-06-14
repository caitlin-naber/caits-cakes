import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    private String menuFileName;

    public void menuFileReader(String menuFileName) {
        this.menuFileName = menuFileName;
    }

    // read from file and return an ordered map of menu items (cakes)

    public Map<String, Cake> readMenuFile() {
        Map<String, Cake> menuItems = new HashMap<>();
        File file = new File(menuFileName);

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
