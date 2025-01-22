import java.util.ArrayList;

// Define the Product class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method for easy printing
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

// Define the Order class
class Order {
    private String orderId;
    private ArrayList<Product> products;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display the order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

// Define the Customer class
class Customer {
    private String name;
    private ArrayList<Order> orders;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to get the customer name
    public String getName() {
        return name;
    }

    // Method to display the customer's orders
    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Demonstrate the relationships
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 150000.0);
        Product product2 = new Product("Smartphone", 33000.0);
        Product product3 = new Product("Headphones", 3200.0);

        // Create orders
        Order order1 = new Order("Order001");
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("Order002");
        order2.addProduct(product3);

        // Create a customer
        Customer customer = new Customer("Saurabh Kumar");

        // Place orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display the customer's orders
        customer.displayOrders();
    }
}
