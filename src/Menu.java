import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);

    FileReader fileReader = new FileReader();
    ShoppingCart cart = new ShoppingCart();

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
        int i = 1;
        for (Map.Entry<String, Cake> menuItem: todaysMenu.entrySet()) {
            Cake itemValue = menuItem.getValue();
            System.out.println("(" + i + ") " + itemValue.cakeSummary());
            i++;
        }

    }

    public String getUserInput() {
        String userInput = in.nextLine();
        return userInput;
    }

    public boolean getOrderStarted() {
        System.out.println("Would you like to place an order? (Y)/(N)");
        String startOrder = getUserInput();
        if (!startOrder.equalsIgnoreCase("Y") && !startOrder.equalsIgnoreCase("N")) {
            invalidUserEntry();
        } else if (startOrder.equalsIgnoreCase("N")) {
            System.out.println("We hope to see you again soon!");
            return false;
        } else {
            completeOrder();
        }
        return true;
    }

    // todo: this should not be here
//    public void buildOrder() {
//
//        // todo: need to access "index" from the menu list
//        if (!orderType.equalsIgnoreCase("L") && !orderType.equalsIgnoreCase("C")) {
//            invalidUserEntry();
//        } else if (orderType.equalsIgnoreCase("L")) {
//            System.out.println("How many layers would you like your cake to be? We offer 2 and 3 layers.");
//            String cakeLayers = getUserInput() + " layers";
//            System.out.println("What size would you like your cake to be? We offer 6, 8, and 9 inch cakes.");
//            String cakeSize = getUserInput() + " inch";
//            cart.addLayerCakeToCart(cakeToOrder, cakeLayers, cakeSize);
//        } else if (orderType.equalsIgnoreCase("C")) {
//            System.out.println("How many cupcakes would you like to order?");
//            int cupcakesToOrder = Integer.parseInt(getUserInput());
////            cart.addCupcakesToCart(cakeToOrder, cupcakesToOrder);
//        }
//    }

    // todo: this should not be here
    public void completeOrder() {
        cart.orderConfirmation();
    }

    public Cake getOrderSelection() {
        System.out.println("Please enter the number of the type of cake you would like to build an order for.");
        int selectedCake = Integer.parseInt(getUserInput());
        Cake cakeToOrder = fileReader.getTodaysMenu().get(selectedCake - 1);
        return cakeToOrder;
    }

    public String getOrderType() {
        System.out.println("Would you like to order a (L)ayer Cake or (C)upcakes?");
        String orderType = getUserInput();
        return orderType;
    }

    public void invalidUserEntry() {
        System.out.println("*** You have entered an invalid selection. Please try again. ***\n");
    }
}
