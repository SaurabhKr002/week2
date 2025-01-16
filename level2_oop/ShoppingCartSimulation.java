import java.util.*;

class CartItem {

    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the cost of the item
    public double getItemTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {

    // List to hold cart items
    private List<CartItem> cartItems;

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        cartItems.add(item);
        System.out.println(item.getItemName() + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(item.getItemName() + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0.0;
        for (CartItem item : cartItems) {
            totalCost += item.getItemTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
    }

    // Method to display all cart items
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart Items:");
            for (CartItem item : cartItems) {
                System.out.println("Item Name: " + item.getItemName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Total Cost: " + item.getItemTotalCost());
            }
        }
    }
}

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Create a ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(new CartItem("Laptop", 70000.0, 1));
        cart.addItem(new CartItem("Mouse", 500.0, 2));

        // Display cart items
        cart.displayCartItems();

        // Display the total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Mouse");

        // Display cart items after removal
        cart.displayCartItems();

        // Display the total cost after removal
        cart.displayTotalCost();
    }
}
