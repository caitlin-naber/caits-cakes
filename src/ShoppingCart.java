import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Cake> cakesInCart = new ArrayList<>();

    public void addCake(Cake cakeToAdd) {
        cakesInCart.add(cakeToAdd);
    }

    // learn how to work with BigDecimal
    public BigDecimal getTotalPrice() {
        BigDecimal total = new BigDecimal("0.00");
        for (Cake cake : cakesInCart) {
            total.add(cake.getPrice());
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
