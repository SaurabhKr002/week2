package hybridinheritance.restaurantmanagementsystem;

// Represents a chef who inherits from Person and implements Worker
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor to initialize chef details
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Method to display the details of the chef
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }

    // Implementation of duties specific to a chef
    @Override
    public void performDuties() {
        System.out.println("Duties: Prepares meals, manages kitchen staff, ensures food quality.");
    }
}
