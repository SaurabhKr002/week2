public class Patient {
    // Static variable shared across all patients
    private static String hospitalName = "AIMS Hospital Bhopal";
    
    // Static variable to keep track of the total number of patients
    private static int totalPatients = 0;
    
    // Final variable to ensure it cannot be changed once assigned
    private final int patientID;
    
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        // Check if the object is an instance of Patient
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Saurabh Kumar", 101, 26, "Flu");
        Patient patient2 = new Patient("Anand Soni", 102, 23, "Fracture");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}


//p7