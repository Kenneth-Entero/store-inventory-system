import java.util.ArrayList;

/**
 * Manages the collection of products in the inventory system.
 * Demonstrates Encapsulation (private fields with controlled access)
 * and Polymorphism (ArrayList storing Product base class references).
 */
public class Inventory {
    private ArrayList<Product> products;
    private LowStockAlert alert;

    /**
     * Constructs an Inventory instance and initializes the product list and alert handler.
     */
    public Inventory() {
        this.products = new ArrayList<>();
        this.alert = new LowStockAlert();
    }

    /**
     * Adds a new product (FoodProduct or NonFoodProduct) to the inventory list.
     * Demonstrates Lesson 9.5 (.add method).
     *
     * @param product The Product object to add
     */
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product successfully added!");
    }

    /**
     * Displays details for all products currently in the inventory.
     * Demonstrates Polymorphism through dynamic method dispatch.
     */
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is currently empty.");
            return;
        }
        System.out.println("\n=== INVENTORY LIST ===");
        for (Product product : products) {
            product.displayInfo(); // Polymorphic call (FoodProduct or NonFoodProduct displayInfo)
        }
    }

    /**
     * Updates the stock quantity of a product by its ID and evaluates if a low-stock alert is triggered.
     *
     * @param id          The ID of the product to update
     * @param newQuantity The new stock level
     */
    public void updateStock(int id, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(newQuantity);
                System.out.println("Stock updated successfully for Product ID " + id + ".");
                alert.check(product); // Checks if updated stock triggers alert
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    /**
     * Removes a product from the inventory using its ID.
     * Demonstrates Lesson 9.5 (.remove method).
     *
     * @param id The ID of the product to remove
     */
    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Product ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    /**
     * Scans all items in the inventory and prints alerts for any product at or below low stock level.
     */
    public void checkLowStock() {
        System.out.println("\n=== CHECKING LOW STOCK ITEMS ===");
        boolean foundLowStock = false;
        for (Product product : products) {
            if (product.isLowStock()) {
                alert.check(product);
                foundLowStock = true;
            }
        }
        if (!foundLowStock) {
            System.out.println("All products have sufficient stock levels.");
        }
    }
}
