import java.util.HashMap;
import java.util.Map;

public class GroceryCostManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");
        int count = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + " - $" + entry.getValue());
            count++;
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }
    public static void main(String[] args) {
        GroceryCostManager manager = new GroceryCostManager();

        manager.addItem("Apples", 0.30);
        manager.addItem("Milk", 1.45);
        manager.addItem("Bread", 1.99);

        manager.displayList();

        System.out.println("\nTotal Cost: $" + manager.calculateTotalCost());

        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));

        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");

        manager.displayList();

        System.out.println("\nUpdated Total Cost: $" + manager.calculateTotalCost());
    }
}
