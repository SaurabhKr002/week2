package hybridinheritance.vehiclemanagementsystem;

// Main class to demonstrate the vehicle management system
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Ford Mustang", 60);

        System.out.println("----- Electric Vehicle Details -----");
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();

        System.out.println("----- Petrol Vehicle Details -----");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
        System.out.println();
    }
}
