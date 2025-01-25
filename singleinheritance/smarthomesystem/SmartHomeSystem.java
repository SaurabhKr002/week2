package singleinheritance.smarthomesystem;
// Main class to execute the smart home system program
public class SmartHomeSystem {
    public static void main(String[] args) {

        // Create a generic device instance
        Device device1 = new Device("Device001", "ON");

        // Create a thermostat instance with specific settings
        Thermostat thermostat1 = new Thermostat("Thermo001", "ON", 22.5);

        // Display details of the generic device
        System.out.println("_______________________________");
        device1.displayStatus();
        System.out.println("_______________________________");

        // Display details of the thermostat, including specific settings
        thermostat1.displayStatus();
        System.out.println("_______________________________");
    }
}
