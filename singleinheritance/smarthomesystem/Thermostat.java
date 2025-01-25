package singleinheritance.smarthomesystem;

// Subclass representing a specific type of device: Thermostat
public class Thermostat extends Device {

    // Additional attribute specific to Thermostat
    private double temperatureSetting; // Current temperature setting of the thermostat

    // Constructor for Thermostat class
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        // Call the superclass constructor to initialize common attributes
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting; // Initialize temperature setting
    }

    // Method overriding: Add thermostat-specific details to the output
    @Override
    public void displayStatus() {
        // Call superclass method to display common details
        super.displayStatus();
        // Display additional details about the thermostat
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
