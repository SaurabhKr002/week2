package Assisted_Problems;

// Base class representing a generic Vehicle
class Vehicle {

    // Attributes for a generic vehicle
    private int maxSpeed; // Maximum speed of the vehicle
    private String fuelType; // Fuel type of the vehicle (e.g., petrol, diesel)

    // Default constructor
    Vehicle() {}

    // Parameterized constructor
    Vehicle(int maxSpeed, String fuelType) {
        // Initialize attributes using constructor parameters
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display basic information about the vehicle
    public void displayInfo() {
        System.out.println("Vehicle max speed: " + maxSpeed);
        System.out.println("Vehicle fuel type: " + fuelType);
    }
}

// Subclass representing a Car
class Car extends Vehicle {

    // Additional attribute specific to cars
    private int seatCapacity; // Number of seats in the car

    // Constructor for Car class
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        // Call the superclass constructor to initialize common attributes
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity; // Initialize seatCapacity
    }

    // Method overriding: Add car-specific details to the output
    @Override
    public void displayInfo() {
        // Call the superclass method to display common details
        super.displayInfo();
        System.out.println("Vehicle seat capacity: " + seatCapacity);
    }
}

// Subclass representing a Truck
class Truck extends Vehicle {

    // Additional attribute specific to trucks
    private int numberOfTyres; // Number of tyres the truck has

    // Constructor for Truck class
    Truck(int maxSpeed, String fuelType, int numberOfTyres) {
        // Call the superclass constructor to initialize common attributes
        super(maxSpeed, fuelType);
        this.numberOfTyres = numberOfTyres; // Initialize numberOfTyres
    }

    // Method overriding: Add truck-specific details to the output
    @Override
    public void displayInfo() {
        // Call the superclass method to display common details
        super.displayInfo();
        System.out.println("Vehicle Number of Tyres: " + numberOfTyres);
    }
}

// Subclass representing a Motorcycle
class Motorcycle extends Vehicle {

    // Additional attribute specific to motorcycles
    private int numberOfGears; // Number of gears the motorcycle has

    // Constructor for Motorcycle class
    Motorcycle(int maxSpeed, String fuelType, int numberOfGears) {
        // Call the superclass constructor to initialize common attributes
        super(maxSpeed, fuelType);
        this.numberOfGears = numberOfGears; // Initialize numberOfGears
    }

    // Method overriding: Add motorcycle-specific details to the output
    @Override
    public void displayInfo() {
        // Call the superclass method to display common details
        super.displayInfo();
        System.out.println("Vehicle Number of Gears: " + numberOfGears);
    }
}

// Main class to execute the program
public class VehicleAndTransportSystem {
    public static void main(String[] args) {

        // Array to store different types of vehicles
        Vehicle[] array = new Vehicle[4];

        // Create instances of different vehicle types
        array[0] = new Vehicle(0, "fuel"); // Generic vehicle
        array[1] = new Car(250, "Premium Petrol", 4); // Car instance
        array[2] = new Truck(200, "Diesel", 16); // Truck instance
        array[3] = new Motorcycle(220, "Petrol", 5); // Motorcycle instance

        // Display information for each vehicle in the array
        System.out.println("_______________________________");
        array[0].displayInfo(); // Display generic vehicle info
        System.out.println("_______________________________");
        array[1].displayInfo(); // Display car-specific info
        System.out.println("_______________________________");
        array[2].displayInfo(); // Display truck-specific info
        System.out.println("_______________________________");
        array[3].displayInfo(); // Display motorcycle-specific info
        System.out.println("_______________________________");
    }
}
