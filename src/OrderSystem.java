

public class OrderSystem {

//    public Cake buildCakeForOrder (String orderType) {
//        if (orderType.equalsIgnoreCase("L")) {
//            buildLayerCakeToOrder();
//        }
//    }

    public String buildLayerCakeToOrder(Cake cakeToOrder, String numberOfLayers, String cakeSize) {
        String cakeName = cakeToOrder.getName();
        return cakeSize + " " + cakeName + " cake with " + numberOfLayers;
    }

    public String buildCupcakesToOrder(Cake cakeToOrder, int numberOfCupcakes) {
        String cakeName = cakeToOrder.getName();
        return numberOfCupcakes + " " + cakeName + " cupcakes";
    }
}
