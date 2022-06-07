import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CakeShop {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("*Welcome to Cait's Cakes!*");
        System.out.println("---------------------------");

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
            System.out.println(cake.cakeSummary());
        }


        // take input to get order
        Scanner userInput = new Scanner(System.in);

        // return confirmation


    }

}
