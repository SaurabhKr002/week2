package multilevelinheritance.onlineretailordermanagement;

// Subclass of Order representing a shipped order
class ShippedOrder extends Order {
    private String trackingNumber; // Tracking number for the shipped order

    // Constructor to initialize shipped order details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        // Call the superclass (Order) constructor to initialize common attributes
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override method to display additional details specific to a shipped order
    @Override
    public void displayDetails() {
        // Call the superclass method to display common details
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    // Override method to provide the current status of the shipped order
    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking number: " + trackingNumber;
    }
}
