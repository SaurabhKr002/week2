class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double RATE_PER_DAY = 1000.0; // Example rate per day

    // Default Constructor
    public CarRental() {
        this("Unknown Customer", "Generic Model", 1);
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * RATE_PER_DAY;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: INR " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Default Constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Parameterized Constructor
        CarRental paramRental = new CarRental("Ravi Kumar", "Honda Civic", 5);
        System.out.println("\nParameterized Rental:");
        paramRental.displayRentalDetails();
    }
}
