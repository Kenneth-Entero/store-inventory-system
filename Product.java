// General products in the inventory.
public abstract class Product {
    private int id;
    privare String name;
    private int quantity;
    private int lowStocklevel;
// Creates a new product.
public Product(int id, String name, int quantity, int lowStockLevel) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.lowStockLevel = lowStockLevel;
}
  // Getter methods
  public int getid() {
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
// Updates the product quantity
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
  // Checks if the product has reached the low stock level
