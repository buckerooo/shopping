package buckerooo.shopping;

import java.math.BigDecimal;

public class Checkout {
    public Price total(ShoppingBasket shoppingBasket) {
        return new Price(shoppingBasket.items().stream()
                .map(item -> item.price.value)
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }
}
