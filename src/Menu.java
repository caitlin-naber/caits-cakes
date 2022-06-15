import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);

    OrderSystem system = new OrderSystem();
    FileReader fileReader = new FileReader();

    public void welcomeMessage() {
        System.out.println("----------------------------");
        System.out.println("* Welcome to Cait's Cakes! *");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("Welcome to our bakery! We are still a small operation and can only accept orders of 1 item"
                + " per person at this time. Thank you!");
        System.out.println("Today's offerings are below.\n");
    }

    public void printDaysMenu() {
        // todo: get menu depending on the day of the week
        // todo: look into using switch statement before completing
        // should this be happening in this class?
        String today = system.getDayOfTheWeek();

    }

    public String getUserInput() {
        String userInput = in.nextLine();
        return userInput;
    }

    public int getOrderSelection() {
        System.out.println("Enter a number to start your order.");
        System.out.println("Your selection: ");
        int orderSelection = Integer.parseInt(getUserInput()) - 1;
        return orderSelection;
    }

    public String getOrderType() {
        System.out.println("You have selected [cake].");
        System.out.println("Would you like to order a (A) layer cake or (B) cupcakes? ");
        String orderType = getUserInput();
        return orderType;
    }

}
