//Handles the low stock alert
public class LowStockAlert {

   //Checks a product and displays an alert if stock is low using product as the parameter
    
    public void check(Product product) {
        if (product.isLowStock()) {
            System.out.println("LOW STOCK ALERT: " + product.getName()
                    + " only has " + product.getQuantity() + " left.");
        }
    }
}
