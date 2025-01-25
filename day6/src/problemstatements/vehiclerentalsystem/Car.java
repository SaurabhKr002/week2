package problemstatements.vehiclerentalsystem;

// Car class extending Vehicle and implementing Insurable
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement calculateInsurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    // Implement getInsuranceDetails
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy Number: " + insurancePolicyNumber;
    }
}
