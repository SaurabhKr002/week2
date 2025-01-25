package problemstatements.vehiclerentalsystem;

// Bike class extending Vehicle and implementing Insurable
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    // Implement calculateInsurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    // Implement getInsuranceDetails
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy Number: " + insurancePolicyNumber;
    }
}
