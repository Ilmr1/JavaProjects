import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String purpose;
    private List<String> items;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayList() {
        System.out.println("Shopping List for " + purpose + ":");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
