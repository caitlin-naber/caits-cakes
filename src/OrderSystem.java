

public class OrderSystem {

    ShoppingCart cart = new ShoppingCart();

    public String buildLayerCakeToOrder(Cake cakeToOrder, String numberOfLayers, String cakeSize) {
        String cakeName = cakeToOrder.getName();
        return cakeSize + " " + cakeName + " cake with " + numberOfLayers;
    }

    public String buildCupcakesToOrder(Cake cakeToOrder, int numberOfCupcakes) {
        String cakeName = cakeToOrder.getName();
        return numberOfCupcakes + " " + cakeName + " cupcakes";
    }

    public void completeOrder() {
        cart.orderConfirmation();
    }

}
