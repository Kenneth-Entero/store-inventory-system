import java.util.Scanner;

/**
 * Main application class handling user interface, menu options, and program flow.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n==========================================");
            System.out.println("  STORE INVENTORY & LOW-STOCK ALERT SYSTEM");
            System.out.println("==========================================");
            System.out.println("1. Add Food Product");
            System.out.println("2. Add Non-Food Product");
            System.out.println("3. View Inventory");
            System.out.println("4. Update Stock");
            System.out.println("5. Remove Product");
            System.out.println("6. Check Low Stock");
            System.out.println("7. Exit");
            System.out.print("Enter choice (1-7): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int foodId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int foodQty = scanner.nextInt();
                    System.out.print("Enter Low Stock Level: ");
                    int foodThreshold = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Expiration Date (e.g. YYYY-MM-DD): ");
                    String expDate = scanner.nextLine();

                    inventory.addProduct(new FoodProduct(foodId, foodName, foodQty, foodThreshold, expDate));
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int nonFoodId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String nonFoodName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int nonFoodQty = scanner.nextInt();
                    System.out.print("Enter Low Stock Level: ");
                    int nonFoodThreshold = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();

                    inventory.addProduct(new NonFoodProduct(nonFoodId, nonFoodName, nonFoodQty, nonFoodThreshold, brand));
                    break;

                case 3:
                    inventory.displayProducts();
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update Stock: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQty = scanner.nextInt();
                    inventory.updateStock(updateId, newQty);
                    break;

                case 5:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = scanner.nextInt();
                    inventory.removeProduct(removeId);
                    break;

                case 6:
                    inventory.checkLowStock();
                    break;

                case 7:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
