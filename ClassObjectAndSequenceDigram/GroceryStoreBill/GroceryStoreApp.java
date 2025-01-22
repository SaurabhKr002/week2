import java.util.ArrayList;
import java.util.List;

// Class to represent a Product with a name, price per unit, and quantity
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize Product
    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method to calculate the total price for the product
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    // Getter for product name
    public String getProductName() {
        return productName;
    }
}

// Class to represent a Customer with a name, ID, and list of purchased products
class Customer {
    private String name;
    private String customerID;
    private List<Product> products;

    // Constructor to initialize Customer
    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the customer's list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter for the list of products
    public List<Product> getProducts() {
        return products;
    }

    // Getter for the customer's name
    public String getName() {
        return name;
    }
}

// Class to generate the total bill for a customer
class BillGenerator {
    // Method to calculate the total bill for all products purchased by the customer
    public static double generateBill(Customer customer) {
        double total = 0;

        // Loop through all products to sum their total prices
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }

        // Return the total bill
        return total;
    }
}

// Main class to test the application
public class GroceryStoreApp {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer("Alice", "78901");

        // Add products to the customer
        customer.addProduct(new Product("Apples", 3.0, 2.0)); // 2 kg at $3/kg
        customer.addProduct(new Product("Milk", 2.0, 1.0));   // 1 liter at $2/liter

        // Generate the total bill
        double totalBill = BillGenerator.generateBill(customer);

        // Print the bill details
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Bill: $" + totalBill);
    }
}
