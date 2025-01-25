package multilevelinheritance.onlineretailordermanagement;

// Base class representing a generic order in the system
class Order {
    private String orderId;     // Unique ID of the order
    private String orderDate;   // Date when the order was placed

    // Default constructor
    public Order() {}

    // Parameterized constructor to initialize order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order details
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Method to return the current status of the order
    public String getOrderStatus() {
        return "Order placed.";
    }
}
