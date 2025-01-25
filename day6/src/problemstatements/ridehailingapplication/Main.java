package problemstatements.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Ride-Hailing Application
public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles
        vehicles.add(new Car("V001", "Saurabh Kumar", 15, "Location A"));
        vehicles.add(new Bike("V002", "Gaurav Kumar", 10, "Location B"));
        vehicles.add(new Auto("V003", "Amit Kumar", 12, "Location C"));

        // Display details of each vehicle and calculate fares
        System.out.println("----- Ride-Hailing Application -----");
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            double fare = vehicle.calculateFare(10); // Example: Calculate fare for 10 km
            System.out.println("Fare for 10 km: " + fare);

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("---------------------------------");
        }
    }
}
