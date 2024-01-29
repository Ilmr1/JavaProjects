import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryCategorizingItems {
    private HashMap<String, ArrayList<String>> groceryListByCategory = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        groceryListByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(item);
    }

    public void displayByCategory(String category) {
        System.out.println("Items in Category '" + category + "':");
        ArrayList<String> items = groceryListByCategory.getOrDefault(category, new ArrayList<>());
        if (items.isEmpty()) {
            System.out.println("No items found in this category.");
        } else {
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    public static void main(String[] args) {
        GroceryCategorizingItems manager = new GroceryCategorizingItems();

        manager.addItemWithCategory("Apples", "Fruits");
        manager.addItemWithCategory("Bananas", "Fruits");
        manager.addItemWithCategory("Milk", "Dairy");
        manager.addItemWithCategory("Bread", "Bakery");

        manager.displayByCategory("Fruits");
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Bakery");

        manager.displayByCategory("Meat");
    }
}
