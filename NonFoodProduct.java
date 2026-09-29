/**
 * Represents a non-food product in the inventory system (e.g., notebooks, pens, school supplies).
 * Demonstrates Inheritance (extends Product) and Polymorphism (@Override displayInfo).
 */
public class NonFoodProduct extends Product {
    private String brand;

    /**
     * Constructor for NonFoodProduct.
     *
     * @param id            Product ID
     * @param name          Product Name
     * @param quantity      Current stock quantity
     * @param lowStockLevel Threshold quantity for low stock warning
     * @param brand         Brand of the non-food product
     */
    public NonFoodProduct(int id, String name, int quantity, int lowStockLevel, String brand) {
        super(id, name, quantity, lowStockLevel); // Tinatawag ang constructor ng parent class (Product)
        this.brand = brand;
    }

    /**
     * Gets the brand of the non-food product.
     *
     * @return Product brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Displays complete details of the non-food product.
     * Overrides the abstract method displayInfo() in Product class.
     */
    @Override
    public void displayInfo() {
        System.out.println("----------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Non-Food");
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Low Stock Level: " + getLowStockLevel());
        System.out.println("Brand: " + getBrand());
        System.out.println("----------------------------------------");
    }
}
