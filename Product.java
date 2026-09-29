/**
 * Abstract base class representing a generic product in the inventory system.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class Product {
    private int id;
    private String name; // Na-fix na mula 'privare'
    private int quantity;
    private int lowStockLevel;

    /**
     * Constructor to initialize a Product instance.
     *
     * @param id            Product ID
     * @param name          Product Name
     * @param quantity      Current stock quantity
     * @param lowStockLevel Threshold quantity for low stock warning
     */
    public Product(int id, String name, int quantity, int lowStockLevel) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.lowStockLevel = lowStockLevel;
    }

    // Getters and Setters (Encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLowStockLevel() {
        return lowStockLevel;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Checks if the current stock is at or below the low stock threshold.
     *
     * @return true if quantity <= lowStockLevel, false otherwise
     */
    public boolean isLowStock() {
        return this.quantity <= this.lowStockLevel;
    }

    /**
     * Abstract method to display product details.
     * Must be overridden by child classes (Polymorphism).
     */
    public abstract void displayInfo();
}
