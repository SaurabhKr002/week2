class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Default Constructor
    public Product() {
        this("Unnamed Product", 0.0);
    }

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: INR " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 50000.0);
        Product product2 = new Product("Smartphone", 25000.0);

        // Displaying product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        // Displaying total products
        System.out.println("\nTotal Products:");
        Product.displayTotalProducts();
    }
}
