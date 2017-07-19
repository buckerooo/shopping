package buckerooo.shopping;

import org.junit.Test;

import static buckerooo.shopping.Price.priceInPence;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class PriceTest {

    @Test
    public void shouldHaveSameEqualsAndHashCodeWhenPricesAreTheSame() {
        assertTrue("Equals should match", priceInPence("20").equals(priceInPence("20")));
        assertTrue("Hashcode should match", priceInPence("20").hashCode() ==  priceInPence("20").hashCode());
    }

    @Test
    public void shouldHaveDifferentSameEqualsAndHashCodeWhenPricesAreTheSame() {
        assertFalse("Equals should not match", priceInPence("20").equals(priceInPence("30")));
        assertFalse("Hashcode should not match", priceInPence("20").hashCode() ==  priceInPence("30").hashCode());
    }

    @Test
    public void shouldPrintThePriceInPence() {
        assertThat(priceInPence("120").toString(), equalTo("120p"));
    }

}