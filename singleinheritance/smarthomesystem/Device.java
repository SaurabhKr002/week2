package singleinheritance.smarthomesystem;
// Base class representing a generic smart home device
public class Device {

    // Attributes for a smart home device
    private String deviceId; // Unique ID of the device
    private String status;   // Status of the device (e.g., ON, OFF)

    // Default constructor
    public Device() {}

    // Parameterized constructor
    public Device(String deviceId, String status) {
        // Initialize attributes using constructor parameters
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the device's status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Status: " + status);
    }
}
