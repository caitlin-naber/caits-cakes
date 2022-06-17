import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CakeShop {

    public static void main(String[] args) {

        OrderSystem system = new OrderSystem();
        Menu menu = new Menu();

        menu.welcomeMessage();
        menu.printDaysMenu();
        
//
//
//        Cake selectedCake = todaysCakes.get(selection);
//        List<Cake> orderedItems = new ArrayList<>();
//
//        // start order
//        System.out.println("\nYou have selected a " + todaysCakes.get(selection).getName() + ".");
//        System.out.println("\nWould you like to order a layer cake or cupcakes? ");
//        System.out.println("(Enter 'cake' or 'cupcakes'.)");
//        String orderType = userInput.nextLine();
//
//
//        // make sure input is valid
//        // order functionality for layer cakes and cupcakes
//        if ((!orderType.toLowerCase().equals("cake")) && (!orderType.toLowerCase().equals("cupcake"))) {
//            System.out.println("You entered something that wasn't 'cake' or 'cupcakes'. Please start over.");
//        } else if (orderType.toLowerCase().equals("cake")) {
//            System.out.println("\nWe make 2 and 3 layer cakes. How many layers would you like?");
//            System.out.println("(Enter 2 or 3.)");
//            String userEnteredLayers = userInput.nextLine();
//            int layers = Integer.parseInt(userEnteredLayers);
//            System.out.println("\nWe make 6in, 8in, and 9in cakes. What size would you like?");
//            System.out.println("(Enter 6, 8, or 9.)");
//            String userEnteredCakeSize = userInput.nextLine();
//            int cakeSize = Integer.parseInt(userEnteredCakeSize);
//            LayerCake currentOrder = new LayerCake(selectedCake.getName(), selectedCake.getCakeType(),
//                    selectedCake.getFrostingType(), selectedCake.getFilling(), selectedCake.getDecorations(),
//                    layers, cakeSize);
//            orderedItems.add(currentOrder);
//        } else if (orderType.toLowerCase().equals("cupcakes")) {
//            System.out.println("\nYou can order cupcakes in multiples of 4");
//            System.out.println("Please enter the number of cupcakes you would like to order:");
//            String userEnteredNumber = userInput.nextLine();
//            int numberOfCupcakes = Integer.parseInt(userEnteredNumber);
//            if (numberOfCupcakes % 4 != 0) {
//                System.out.println("We currently only accept orders for cupcakes in multiples of 4. Please restart"
//                        + " your order.");
//            } else {
//                Cake currentOrder = new Cake(selectedCake.getName(), selectedCake.getCakeType(),
//                        selectedCake.getFrostingType(), selectedCake.getFilling(), selectedCake.getDecorations());
//                orderedItems.add(currentOrder);
//            }
//
//        }
//
//        // confirm selections
//        System.out.println("\nPlease review and ensure the following is correct.");
//        for (Cake cake : orderedItems) {
//            System.out.println(cake.cakeSummary());
//        }
//        System.out.println("\nIf everything looks correct, enter Y. If not, enter N");
//        String confirmOrder = userInput.nextLine();
//
//        if (confirmOrder.equals("N")) {
//            System.out.println("Looks like we went wrong somewhere. Please start your order again.");
//        } else {
//            System.out.println("\nGreat! We've added it to your order.");
//        }
//
    }

}

/*
todo: save the order to a file for our records
todo: confirm the order and give them a price

 */