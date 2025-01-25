package problemstatements.vehiclerentalsystem;

// Truck class extending Vehicle and implementing Insurable
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Additional charge for trucks
    }

    // Implement calculateInsurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    // Implement getInsuranceDetails
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy Number: " + insurancePolicyNumber;
    }
}
