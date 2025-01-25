package hybridinheritance.restaurantmanagementsystem;

// Main class to demonstrate the restaurant management system
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Saurabh Kumar", 101, "Indian Cuisine");
        Waiter waiter = new Waiter("Anand Soni", 201, "Outdoor Section");

        System.out.println("----- Chef Details -----");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        System.out.println("----- Waiter Details -----");
        waiter.displayDetails();
        waiter.performDuties();
        System.out.println();
    }
}
