class Item {
    // Fields (Attributes)
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: INR " + price+"/-");
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryMain {
    public static void main(String[] args) {
        // Create Item object
        Item item = new Item("A101", "Laptop", 54999.99);

        // Display details of the item
        item.displayDetails();

        // Calculate and display the total cost for a given quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for Quantity " + quantity + ": INR " + totalCost+"/-");
    }
}
