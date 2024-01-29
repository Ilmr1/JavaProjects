import java.util.HashMap;
import java.util.Map;

public class GroceryQuantityList {
    private HashMap<String, Integer> groceryListWithQuantity = new HashMap<>();

    public void addItemWithQuantity(String item, int quantity) {
        groceryListWithQuantity.put(item, groceryListWithQuantity.getOrDefault(item, 0) + quantity);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryListWithQuantity.containsKey(item)) {
            groceryListWithQuantity.put(item, newQuantity);
        } else {
            System.out.println(item + " does not exist in the grocery list.");
        }
    }
    public void displayAvailableItems() {
        System.out.println("Available Items in Grocery List:");
        for (Map.Entry<String, Integer> entry : groceryListWithQuantity.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println("- " + entry.getKey() + ": Quantity = " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        GroceryQuantityList manager = new GroceryQuantityList();

        manager.addItemWithQuantity("Apples", 5);
        manager.addItemWithQuantity("Milk", 2);
        manager.addItemWithQuantity("Bread", 3);

        manager.displayAvailableItems();

        manager.updateQuantity("Milk", 1);

        System.out.println("\nAfter updating quantity:");
        manager.displayAvailableItems();
    }
}
