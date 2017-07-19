package buckerooo.shopping;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class Checkout {
    public Price total(ShoppingBasket shoppingBasket) {
        return new Price(shoppingBasket.items().stream()
                .map(item -> item.price.value)
                .reduce(ZERO, BigDecimal::add));
    }
}
