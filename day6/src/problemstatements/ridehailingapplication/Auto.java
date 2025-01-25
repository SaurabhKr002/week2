package problemstatements.ridehailingapplication;

// Auto class extending Vehicle and implementing GPS
public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement calculateFare for Auto
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10; // Additional charge for auto
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
