package problemstatements.onlinefooddeliverysystem;

// Abstract class FoodItem
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
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

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();
}
