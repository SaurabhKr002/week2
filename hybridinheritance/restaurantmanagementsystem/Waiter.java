package hybridinheritance.restaurantmanagementsystem;

// Represents a waiter who inherits from Person and implements Worker
class Waiter extends Person implements Worker {
    private String section;

    // Constructor to initialize waiter details
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Method to display the details of the waiter
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Assigned Section: " + section);
    }

    // Implementation of duties specific to a waiter
    @Override
    public void performDuties() {
        System.out.println("Duties: Serves food, takes orders, ensures customer satisfaction.");
    }
}
