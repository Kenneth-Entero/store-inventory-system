// Represents a food product
public class FoodProduct extends Product {
  private String expirationDate;
  
//  Creates a food product 
    public FoodProduct(int id, String name, int quantity, int lowStockLevel, String expirationDate) {
        super(id, name, quantity, lowStockLevel);
        this.expirationDate = expirationDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
/*use @Override in a public void named displayInfo printing out the id, name, type of the product,
low stock level, and expiration date.*/
