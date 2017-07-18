package buckerooo.shopping;

import java.math.BigDecimal;

public class Price {
    public final BigDecimal value;

    Price(BigDecimal price) {
        this.value = price;
    }

    public static Price priceInPence(String price) {
        return new Price(new BigDecimal(price));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price1 = (Price) o;

        if (!value.equals(price1.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toPlainString() + "p";
    }
}
