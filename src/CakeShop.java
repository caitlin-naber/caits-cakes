import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CakeShop {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("*Welcome to Cait's Cakes!*");
        System.out.println("---------------------------");

        // create cake options
        Cake deathByChocolate = new Cake("Death by Chocolate","Chocolate Cake", "Dark Chocolate Buttercream", "Chocolate Drizzle");
        Cake mochaButter = new Cake("Mocha Butter Cake", "Yellow Butter Cake", "Mocha Buttercream", "Chocolate Covered Espresso Bean");
        Cake lemonBlueberry = new Cake("Lemon Blueberry Cake" ,"Lemon Cake", "Blueberry Buttercream", "Lemon Curd Filling");

        // put all cakes in a list
        List<Cake> todaysCakes = new ArrayList<>();
        todaysCakes.add(deathByChocolate);
        todaysCakes.add(mochaButter);
        todaysCakes.add(lemonBlueberry);

        // print out list of options
        for (Cake cake : todaysCakes) {
            System.out.println(cake.cakeSummary());
        }


        // take input to get order
        Scanner userInput = new Scanner(System.in);

        // return confirmation


    }

}
