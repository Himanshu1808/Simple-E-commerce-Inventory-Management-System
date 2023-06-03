import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Integer> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            int currentQuantity = inventory.get(product);
            inventory.put(product, currentQuantity + quantity);
        } else {
            inventory.put(product, quantity);
        }
        System.out.println(quantity + " " + product + "(s) added to the inventory.");
    }

    public void updateProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, quantity);
            System.out.println(product + " quantity updated to " + quantity);
        } else {
            System.out.println(product + " does not exist in the inventory.");
        }
    }

    public void removeProduct(String product) {
        if (inventory.containsKey(product)) {
            inventory.remove(product);
            System.out.println(product + " removed from the inventory.");
        } else {
            System.out.println(product + " does not exist in the inventory.");
        }
    }

    public void checkStock(String product) {
        if (inventory.containsKey(product)) {
            int quantity = inventory.get(product);
            System.out.println("Available stock of " + product + ": " + quantity);
        } else {
            System.out.println(product + " does not exist in the inventory.");
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Adding products
        inventorySystem.addProduct("Shirt", 10000);
        inventorySystem.addProduct("Pants", 7500);
        inventorySystem.addProduct("Shoes", 2000);

        // Checking stock
        inventorySystem.checkStock("Shirt");  // Output: Available stock of Shirt: 10

        // Updating product quantity
        inventorySystem.updateProduct("Shirt", 15);  // Output: Shirt quantity updated to 15

        // Removing a product
        inventorySystem.removeProduct("Pants");  // Output: Pants removed from the inventory

        // Checking stock after removing a product
        inventorySystem.checkStock("Pants");  // Output: Pants does not exist in the inventory
    }
}
