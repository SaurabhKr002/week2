package problemstatements.ridehailingapplication;

// Bike class extending Vehicle and implementing GPS
public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement calculateFare for Bike
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // 20% discount for bikes
    }

    // Implement getCurrentLocation
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implement updateLocation
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
