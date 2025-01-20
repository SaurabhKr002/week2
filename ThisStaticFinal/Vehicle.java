public class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee = 500.0; // Registration fee
    
    // Final variable to ensure it cannot be changed once assigned
    private final String registrationNumber;
    
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        // Check if the object is an instance of Vehicle
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("REG123", "Saurabh Kumar", "Car");
        Vehicle vehicle2 = new Vehicle("REG456", "Amit kumar", "Bike");

        // Display initial vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        // Update the registration fee
        Vehicle.updateRegistrationFee(600.0);
        System.out.println("Updated Registration Fee: " + registrationFee);

        // Display vehicle details after fee update
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}


//p6