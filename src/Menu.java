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

    public void closedMessage() {
        System.out.println("Sorry, we're closed today. Please come back another day!");
    }

    public void printDaysMenu() {
        Map<String, Cake> todaysMenu = fileReader.getTodaysMenu();
        for (Map.Entry<String, Cake> menuItem: todaysMenu.entrySet()) {
            Cake itemValue = menuItem.getValue();
            System.out.println(itemValue.cakeSummary());
        }

    }

    public String getUserInput() {
        String userInput = in.nextLine();
        return userInput;
    }

    public String getOrderStarted() {
        System.out.println("Would you like to place an order?");
        String startOrder = getUserInput();
        if (!startOrder.equalsIgnoreCase("Y") || !startOrder.equalsIgnoreCase("N")) {
            invalidUserEntry();
        } else if (startOrder.equalsIgnoreCase("N")) {
            System.out.println("We hope to see you again soon!");
        } else {
            // todo: cakes need to have a way to order
        }
        return startOrder;
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

    public void invalidUserEntry() {
        System.out.println("*** You have entered an invalid selection. Please try again. ***\n");
    }
}
