package problemstatements.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Vehicle Rental System
public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles
        vehicles.add(new Car("C123", "Car", 1000, "CAR12345"));
        vehicles.add(new Bike("B456", "Bike", 500, "BIKE98765"));
        vehicles.add(new Truck("T789", "Truck", 2000, "TRUCK56789"));

        // Display details of each vehicle and calculate costs
        System.out.println("----- Vehicle Rental System -----");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(5); // Example: 5 days rental
            System.out.println("Rental Cost for 5 days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }

            System.out.println("---------------------------------");
        }
    }
}
