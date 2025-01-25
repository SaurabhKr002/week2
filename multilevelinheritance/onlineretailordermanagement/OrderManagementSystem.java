package multilevelinheritance.onlineretailordermanagement;

// Main class to demonstrate multilevel inheritance in an online retail order system
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Create a base order
        Order order1 = new Order("ORD001", "2025-01-20");

        // Create a shipped order
        ShippedOrder shippedOrder1 = new ShippedOrder("ORD002", "2025-01-18", "TRK12345");

        // Create a delivered order
        DeliveredOrder deliveredOrder1 = new DeliveredOrder("ORD003", "2025-01-15", "TRK67890", "2025-01-22");

        // Display details and status of the base order
        System.out.println("_______________________________");
        order1.displayDetails();
        System.out.println("Status: " + order1.getOrderStatus());
        System.out.println("_______________________________");

        // Display details and status of the shipped order
        shippedOrder1.displayDetails();
        System.out.println("Status: " + shippedOrder1.getOrderStatus());
        System.out.println("_______________________________");

        // Display details and status of the delivered order
        deliveredOrder1.displayDetails();
        System.out.println("Status: " + deliveredOrder1.getOrderStatus());
        System.out.println("_______________________________");
    }
}
