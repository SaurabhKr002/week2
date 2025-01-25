package hybridinheritance.vehiclemanagementsystem;

// Represents a petrol vehicle that can be refueled
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // Fuel tank capacity in liters

    // Constructor to initialize petrol vehicle details
    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Method to display the details of the petrol vehicle
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

    // Implementation of the refuel method
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}
