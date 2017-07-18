package buckerooo.shopping;

import org.junit.Test;

import static buckerooo.shopping.Item.*;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ShoppingBasketTest {

    @Test
    public void shouldGetAllTheItemsAddedToTheBasketOutAgain() {
        ShoppingBasket shoppingBasket = new ShoppingBasket(orange, orange, peach);
        assertThat(shoppingBasket.items(), equalTo(asList(orange, orange, peach)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldNotBeAbleToModifyItemsInTheBasket() {
        new ShoppingBasket().items().add(banana);
    }

}