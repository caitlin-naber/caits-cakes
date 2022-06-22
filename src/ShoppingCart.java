import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> cakesInCart = new ArrayList<>();

    public void addLayerCake(String typeOfCake, String typeOfOrder, String numberOfLayers, String cakeSize) {
        // todo: given user entry, build the full order
        String cakeToAdd = typeOfCake + " " + typeOfOrder + " " + numberOfLayers + " " +
                cakeSize;
        cakesInCart.add(cakeToAdd);
    }

    public void addCupcakes(String typeOfCake, int numberOfCupcakes) {
        // todo: given user entry, build the full order
        String cupcakesToAdd = typeOfCake + " " + numberOfCupcakes;
        cakesInCart.add(cupcakesToAdd);
    }

    public void orderConfirmation() {
        for (String cakeInCart : cakesInCart) {
            System.out.println(cakeInCart);
        }
    }

}
