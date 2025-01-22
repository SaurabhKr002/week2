import java.util.ArrayList;

// Define the Doctor class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method to add a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting with Patient " + patient.getName());
    }

    // Method to get the doctor's name
    public String getName() {
        return name;
    }

    // Method to display the doctor's patients
    public void displayPatients() {
        System.out.println("Doctor: " + name);
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

// Define the Patient class
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to get the patient's name
    public String getName() {
        return name;
    }

    // Method to display the patient's doctors
    public void displayDoctors() {
        System.out.println("Patient: " + name);
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}

// Define the Hospital class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display doctors and patients
    public void displayDoctorsAndPatients() {
        System.out.println("Hospital: " + name);
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
        }
        for (Patient patient : patients) {
            patient.displayDoctors();
        }
    }
}

// Demonstrate the relationships
public class HospitalManagement {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("AIMS Bhopal");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Saurabh Kumar");
        Doctor doctor2 = new Doctor("Dr. Anand Soni");

        // Create patients
        Patient patient1 = new Patient("Rahul Kumar");
        Patient patient2 = new Patient("Kuldeep Chaturvedi");

        // Associate doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient2);

        patient1.addDoctor(doctor1);
        patient2.addDoctor(doctor1);
        patient2.addDoctor(doctor2);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display doctors and their patients
        hospital.displayDoctorsAndPatients();

        // Demonstrate consultation
        doctor1.consult(patient1);
        doctor2.consult(patient2);
    }
}
