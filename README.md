# store-inventory-system
Store Inventory and Low-Stock Alert System in Java
# USE THIS CLASSES
Use these exact class names:

Product.java
FoodProduct.java
NonFoodProduct.java
Inventory.java
LowStockAlert.java
Main.java

Do not change the class names so all files work together.
### Relationships of the class
Product
  - FoodProduct
  - NonFoodProduct
Inventory
  - manages Product objects
LowStockAlert
  - checks Product stock
Main
- runs the program and the menu

## Important
FoodProduct and NonFoodProduct must use: extends Product

Example:
public class FoodProduct extends Product

# Product.java Guide
### Class name
Product
### Variables

Use these exact names:

Variable	                  Data                         Type	Purpose
  id	                      int	                          Product ID
  name	                    String	                      Product name
  quantity	                int	                          Current stock
  lowStockLevel	            int	                          Minimum stock before alert

## All variables should be:
### private

Example:

private int id;
private String name;
private int quantity;
private int lowStockLevel;

## Required Methods
Product(...)
getId()
getName()
getQuantity()
getLowStockLevel()
setQuantity()
isLowStock()
displayInfo()

displayInfo() should be:

public abstract void displayInfo();

# FoodProduct.java Guide
### Class name
FoodProduct
**Must** extend:
Product

### Food specific variable
Use: 
private String expirationDate;

## Required Methods
FoodProduct(...)
getExpirationDate()
displayInfo()

displayInfo() must use:

@Override

### Food should display:

ID
Name
Type: Food
Quantity
Low Stock Level
Expiration Date

# NonFoodProduct.java Guide
### Class name
NonFoodProduct
**Must** extend:
Product

### Non-Food specific variable
Use: 
private String brand;

## Required Methods
NonFoodProduct(...)
getBrand()
displayInfo()

displayInfo() must use:

@Override

### Non-Food should display:

ID
Name
Type: Non-Food
Quantity
Low Stock Level
Brand

# Inventory.java Guide
### Class name
Inventory
### Variables
**Use:**
private ArrayList<Product> products;
private LowStockAlert alert;

**Import**
import java.util.ArrayList;

## Required methods
Inventory() 
addProduct() 
displayProducts() 
updateStock() 
removeProduct() 
checkLowStock()

## Important
**The ArrayList must be:**

ArrayList<Product>

**NOT:**
ArrayList<FoodProduct>

because the inventory needs to contain both Food and Non-Food products.

Example:

private ArrayList<Product> products;

# LowStockAlert.java
### Class name
LowStockAlert
## Required method
check()

**The method receives a:**

Product

Example:

public void check(Product product)

**Use:**

product.isLowStock()

to determine if an alert should appear.

# Main.java Guide
### Class name
Main

**Use:**

Scanner

for user input.

**Import:**

import java.util.Scanner;

**Create:**
Scanner scanner = new Scanner(System.in);
Inventory inventory = new Inventory();

## Menu
1. Add Food Product
2. Add Non-Food Product
3. View Inventory
4. Update Stock
5. Remove Product
6. Check Low Stock
7. Exit

# Naming Rules

**Please use the exact variable names below.**

Product
id
name
quantity
lowStockLevel
FoodProduct
expirationDate
NonFoodProduct
brand
Inventory
products
alert
Main
scanner
inventory
choice

**Do not randomly rename these variables.**

For example, don't change:

lowStockLevel

to:

lowStock

unless we all agree to change it everywhere.

# OOP Concepts

**Make sure the project demonstrates these:**

Encapsulation

**Private variables:**

private int quantity;

**Access them using getters/setters:**

getQuantity()
setQuantity()

**Inheritance**
public class FoodProduct extends Product

and:

public class NonFoodProduct extends Product

**Polymorphism**

Use:

Product product = new FoodProduct(...);

or:

Product product = new NonFoodProduct(...);

**And override:**

@Override
public void displayInfo()

**Abstraction**

Product is an abstract class:

public abstract class Product

and contains:

public abstract void displayInfo();

**Javadoc**

Use Javadoc for classes and important methods:

/**
 * Represents a food product.
 */

# Important Rules for Everyone
Don't rename classes.
Don't rename shared variables.
Don't change method names without telling the group.
FoodProduct and NonFoodProduct must extend Product.
Keep Product variables private.
Use getters/setters instead of directly accessing private variables.
Use @Override for displayInfo() in the child classes.
Inventory must use ArrayList<Product>.
Add Javadoc/comments to your code.
Before merging code, test that the project still runs.
If you need to add a new variable or method, tell the group first so the naming stays consistent.
