import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CakeShop {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("*Welcome to Cait's Cakes!*");
        System.out.println("---------------------------");

        System.out.println("");
        System.out.println("Today's offerings are below.\n");

        // create cake options
        Cake deathByChocolate = new Cake("Death by Chocolate", "chocolate cake", "black cocoa buttercream", "dark chocolate ganache", "chocolate drizzle");
        Cake mochaButter = new Cake("Mocha Butter Cake", "yellow butter cake", "mocha buttercream", "none", "chocolate covered espresso beans");
        Cake lemonBlueberry = new Cake("Lemon Blueberry Cake" ,"lemon yellow cake", "blueberry buttercream", "lemon curd", "fresh blueberries");
        Cake rainbowUnicorn = new Cake("Rainbow Unicorn Cake", "rainbow cake layers", "vanilla buttercream", "none", "unicorn horn and decorations");

        // put all cakes in a list
        List<Cake> todaysCakes = new ArrayList<>();
        todaysCakes.add(deathByChocolate);
        todaysCakes.add(mochaButter);
        todaysCakes.add(lemonBlueberry);
        todaysCakes.add(rainbowUnicorn);

        // print out list of options
        for (Cake cake : todaysCakes) {
            System.out.println((todaysCakes.indexOf(cake) + 1) + " - " + cake.cakeSummary());
        }

        // take input to get order
        System.out.println("Enter a number to start your order.");
        System.out.println("Your selection: ");

        Scanner userInput = new Scanner(System.in);
        String selectionInput = userInput.nextLine();
        int selection = (Integer.parseInt(selectionInput)) - 1;
        Cake selectedCake = todaysCakes.get(selection);

        // start order
        System.out.println("\nYou have selected a " + todaysCakes.get(selection).getName() + ".");
        System.out.println("\nWould you like to order a layer cake or cupcakes? ");
        System.out.println("(Enter 'cake' or 'cupcakes'.");
        String orderType = userInput.nextLine();


        // make sure input is valid
        if ((!orderType.toLowerCase().equals("cake")) || (!orderType.toLowerCase().equals("cupcake"))) {
            System.out.println("You entered something that wasn't 'cake' or 'cupcakes'. Please start over.");
        }

        // create a layer cake object
        if (orderType.toLowerCase().equals("cake")) {
            System.out.println("We make 2 and 3 layer cakes. How many layers would you like?");
            System.out.println("Enter 2 or 3.");
        }

        // create a cupcake object


    }

}
