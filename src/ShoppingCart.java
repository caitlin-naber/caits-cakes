import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> cakesInCart = new ArrayList<>();
    OrderSystem system = new OrderSystem();

    public List<String> getCakesInCart(List<String> cakesInCart) {
        return cakesInCart;
    }

    public void addLayerCakeToCart(Cake cakeToOrder, String numberOfLayers, String cakeSize) {
        cakesInCart.add(system.buildLayerCakeToOrder(cakeToOrder, numberOfLayers, cakeSize));
    }

    public void addCupcakesToCart(Cake cakeToOrder, int numberOfCupcakes) {
        cakesInCart.add(system.buildCupcakesToOrder(cakeToOrder, numberOfCupcakes));
    }

    public void orderConfirmation() {
        for (String cakeInCart : cakesInCart) {
            System.out.println(cakeInCart);
        }
    }

}
