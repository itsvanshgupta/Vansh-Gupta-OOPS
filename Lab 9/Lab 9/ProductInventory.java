import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        // Update quantity of product 102
        inventory.put(102, 45);

        // Remove product 101
        inventory.remove(101);

        // Display final inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}