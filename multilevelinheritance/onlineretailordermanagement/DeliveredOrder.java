package multilevelinheritance.onlineretailordermanagement;

// Subclass of ShippedOrder representing a delivered order
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate; // Date when the order was delivered

    // Constructor to initialize delivered order details
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Call the superclass (ShippedOrder) constructor to initialize common attributes
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override method to display additional details specific to a delivered order
    @Override
    public void displayDetails() {
        // Call the superclass method to display common details
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    // Override method to provide the current status of the delivered order
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}
