/**
 * Represents a food product in the inventory system.
 * Demonstrates Inheritance (extends Product) and Polymorphism (@Override displayInfo).
 */
public class FoodProduct extends Product {
    private String expirationDate;

    /**
     * Constructor for FoodProduct.
     *
     * @param id             Product ID
     * @param name           Product Name
     * @param quantity       Current stock quantity
     * @param lowStockLevel  Threshold quantity for low stock warning
     * @param expirationDate Expiration date of the food product (e.g., YYYY-MM-DD)
     */
    public FoodProduct(int id, String name, int quantity, int lowStockLevel, String expirationDate) {
        super(id, name, quantity, lowStockLevel); // Calling the constructor of parent class (Product)
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the expiration date of the food product.
     *
     * @return Expiration date string
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Displays complete details of the food product.
     * Overrides the abstract method displayInfo() in Product class.
     */
    @Override
    public void displayInfo() {
        System.out.println("----------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Food");
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Low Stock Level: " + getLowStockLevel());
        System.out.println("Expiration Date: " + getExpirationDate());
        System.out.println("----------------------------------------");
    }
}
