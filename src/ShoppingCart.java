import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Cake> cakesInCart = new ArrayList<>();

    public void addCake(Cake cakeToAdd) {
        cakesInCart.add(cakeToAdd);
    }

}
