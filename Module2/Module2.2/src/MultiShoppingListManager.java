import java.util.HashMap;
import java.util.Map;

public class MultiShoppingListManager {
    private HashMap<String, ShoppingList> shoppingLists;

    public MultiShoppingListManager() {
        shoppingLists = new HashMap<>();
    }

    public void createShoppingList(String purpose) {
        shoppingLists.put(purpose, new ShoppingList(purpose));
    }

    public void addItemToList(String purpose, String item) {
        ShoppingList list = shoppingLists.get(purpose);
        if (list != null) {
            list.addItem(item);
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public void removeItemFromList(String purpose, String item) {
        ShoppingList list = shoppingLists.get(purpose);
        if (list != null) {
            list.removeItem(item);
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public void displayShoppingList(String purpose) {
        ShoppingList list = shoppingLists.get(purpose);
        if (list != null) {
            list.displayList();
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public static void main(String[] args) {
        MultiShoppingListManager manager = new MultiShoppingListManager();

        manager.createShoppingList("Backyard BBQ");
        manager.addItemToList("Backyard BBQ", "Grill");
        manager.addItemToList("Backyard BBQ", "Charcoal");
        manager.displayShoppingList("Backyard BBQ");

        manager.createShoppingList("Weekend Camping");
        manager.addItemToList("Weekend Camping", "Tent");
        manager.addItemToList("Weekend Camping", "Sleeping Bag");
        manager.displayShoppingList("Weekend Camping");
    }
}
