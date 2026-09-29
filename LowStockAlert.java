/**
 * Handles stock verification and displays warnings for low stock items.
 * Demonstrates Polymorphism by accepting any Product reference.
 */
public class LowStockAlert {

    /**
     * Checks a product and prints a warning alert if its stock is at or below the threshold.
     *
     * @param product The Product object (FoodProduct or NonFoodProduct) to evaluate
     */
    public void check(Product product) {
        if (product.isLowStock()) {
            System.out.println("LOW STOCK ALERT: " + product.getName() + " only has " + product.getQuantity() + " left.");
        }
    }
}
