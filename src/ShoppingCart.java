import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Cake> cakesInCart = new ArrayList<>();

    public void addCake(Cake cakeToAdd) {
        cakesInCart.add(cakeToAdd);
    }

    // learn how to work with BigDecimal
    public double getTotalPrice() {
        double total = 0.0;
        for (Cake cake : cakesInCart) {
            total += cake.getPrice();
        }
        return total;
    }

    public String receipt() {
        String receipt = "\nReceipt\n";
        for (Cake cake : cakesInCart) {
            receipt += cake.cakeSummary();
            receipt += "\n";
        }
        receipt += "\nTotal: $" + getTotalPrice();
        return receipt;
    }
}
