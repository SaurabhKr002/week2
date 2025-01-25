package problemstatements.ridehailingapplication;

// Car class extending Vehicle and implementing GPS
public class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement calculateFare for Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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
