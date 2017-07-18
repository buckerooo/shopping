package buckerooo.shopping;

import org.junit.Test;

import static buckerooo.shopping.Item.*;
import static buckerooo.shopping.Price.priceInPence;
import static java.math.BigDecimal.ZERO;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CheckoutTest {

    @Test
    public void shouldReturnZeroTotalWhenBasketIsEmpty() {
        Price total = new Checkout().total(new ShoppingBasket());
        assertThat(total, equalTo(new Price(ZERO)));
    }

    @Test
    public void shouldCalculateTotalOfAllItemsInBasket() {
        Price total = new Checkout().total(new ShoppingBasket(apple, apple, banana, lemon, orange, peach));
        assertThat(total, equalTo(priceInPence("153")));
    }

}
