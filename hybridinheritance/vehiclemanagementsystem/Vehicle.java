package hybridinheritance.vehiclemanagementsystem;

// Base class representing a generic vehicle
class Vehicle {
    private int maxSpeed;
    private String model;

    // Constructor to initialize vehicle details
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display the details of the vehicle
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
