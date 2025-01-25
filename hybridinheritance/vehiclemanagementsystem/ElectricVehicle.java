package hybridinheritance.vehiclemanagementsystem;

// Represents an electric vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // Battery capacity in kWh

    // Constructor to initialize electric vehicle details
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display the details of the electric vehicle
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to simulate charging the vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}
