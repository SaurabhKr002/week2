class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 5000.0; // Fixed registration fee for all vehicles

    // Default Constructor
    public Vehicle() {
        this("Unknown Owner", "Unknown Type");
    }

    // Parameterized Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    // Setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: INR " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Default Constructor
        Vehicle defaultVehicle = new Vehicle();
        System.out.println("Default Vehicle:");
        defaultVehicle.displayVehicleDetails();

        // Parameterized Constructor
        Vehicle paramVehicle = new Vehicle("Amit Sharma", "Car");
        System.out.println("\nParameterized Vehicle:");
        paramVehicle.displayVehicleDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("\nUpdated Registration Fee:");

        // Displaying vehicle details again after updating registration fee
        defaultVehicle.displayVehicleDetails();
        paramVehicle.displayVehicleDetails();
    }
}
