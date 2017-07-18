package buckerooo.shopping;

import static buckerooo.shopping.Price.priceInPence;

public enum Item {
    banana("13"),
    orange("20"),
    apple("30"),
    lemon("10"),
    peach("50");

    public final Price price;

    Item(String price) {
        this.price = priceInPence(price);
    }
}
