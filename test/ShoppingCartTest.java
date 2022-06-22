import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    Cake testCake;
    String typeOfOrder;
    String numberOfLayers;
    String cakeSize;
    String numberOfCupcakes;
    List<String> cakesInCart = new ArrayList<>();

    @Before
    public void setup() {
        shoppingCart = new ShoppingCart();
        testCake = new Cake("Death by Chocolate", "chocolate cake", "black cocoa buttercream",
                "chocolate ganache", "chocolate drizzle");
    }



    @Test
    public void get_cakes_in_cart() {
        String expectedValue = String.valueOf(testCake);
        cakesInCart.add(String.valueOf(testCake));
        Assert.assertEquals(expectedValue, cakesInCart.get(0));
    }

    @Test
    public void layer_cake_added_to_cart_has_expected_values() {
        numberOfLayers = "2";
        cakeSize = "8";
        String cake = numberOfLayers + cakeSize + String.valueOf(testCake);
        cakesInCart.add(cake);
        String expectedValue = numberOfLayers + cakeSize + cake;
        Assert.assertEquals(expectedValue, cakesInCart.get(0));
    }

    @Test
    public void cupcakes_added_to_cart_has_expected_values() {
        numberOfCupcakes = "24";
        String cupcakes = numberOfCupcakes + String.valueOf(testCake);
        cakesInCart.add(cupcakes);
        String expectedValue = numberOfCupcakes + String.valueOf(testCake);
        Assert.assertEquals(expectedValue, cakesInCart.get(0));
    }


}
