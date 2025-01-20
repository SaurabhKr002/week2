public class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // Discount percentage
    
    // Final variable to ensure it cannot be changed once assigned
    private final String productID;
    
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayProductDetails() {
        // Check if the object is an instance of Product
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 50000.0, 10);
        Product product2 = new Product("P002", "Smartphone", 30000.0, 20);

        // Display initial product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        
        // Update the discount
        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");

        // Display product details after discount update
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}


//p4