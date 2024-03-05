import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Mango", 1.5);
        cart.addItem("Pineapple", 2.0);

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Mango", 1.5);
        cart.addItem("Pineapple", 2.0);
        cart.removeItem("Mango");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }
}