import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);

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
    }

    public String getUserInput() {
        String userInput = in.nextLine();
        return userInput;
    }

    public void getOrder() {
        System.out.println("Enter a number to start your order.");
        System.out.println("Your selection: ");
        String orderSelection = getUserInput();
    }

}
