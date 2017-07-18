package buckerooo.shopping;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class ShoppingBasket {
    private final List<Item> items;

    public ShoppingBasket(Item... items) {
        this.items = Collections.unmodifiableList(asList(items));
    }

    public List<Item> items() {
        return items;
    }
}
