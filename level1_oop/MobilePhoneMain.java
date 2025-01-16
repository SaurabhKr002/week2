class MobilePhone {
    // Fields (Attributes)
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR " + price+"/-");
    }
}

public class MobilePhoneMain {
    public static void main(String[] args) {
        // Create MobilePhone object
        MobilePhone phone = new MobilePhone("Xiaomi", "Note 9 pro max", 20000.00);

        // Display details of the mobile phone
        phone.displayDetails();
    }
}
