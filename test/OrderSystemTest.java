import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderSystemTest {

    OrderSystem system = new OrderSystem();
    Cake testCake;
    String typeOfOrder;
    String numberOfLayers;
    String cakeSize;
    String numberOfCupcakes;
    List<String> cakesInCart = new ArrayList<>();

    @Before
    public void setup() {
        testCake = new Cake("Death by Chocolate", "chocolate cake", "black cocoa buttercream",
                "chocolate ganache", "chocolate drizzle");
    }

    @Test
    public void build_layer_cake_to_order_returns_expected_value_for_layer_cake() {
        String cakeName = testCake.getName();
        String expectedItem = cakeSize + " " + cakeName + " cake with " + numberOfLayers;
        String cakeToOrder = system.buildLayerCakeToOrder(testCake, numberOfLayers, cakeSize);
        Assert.assertEquals(expectedItem, cakeToOrder);
    }
}
