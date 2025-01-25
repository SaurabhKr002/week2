package problemstatements.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Hospital Patient Management System
public class Main {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();

        // Add different types of patients
        patients.add(new InPatient("P123", "Saurabh Kumar", 26, "Flu", "No significant history", 5));  // In-patient
        patients.add(new OutPatient("P124", "Rahul Kumar", 23, "Cold", "Allergic to pollen", 200)); // Out-patient
        patients.add(new InPatient("P125", "Anand Soni", 22, "Heart Disease", "Hypertension", 10)); // In-patient
        patients.add(new OutPatient("P126", "Amit Kumar", 21, "Fever", "No significant history", 150)); // Out-patient

        // Display details of each patient and calculate their bill
        System.out.println("----- Hospital Patient Management System -----");
        for (Patient patient : patients) {
            patient.getPatientDetails();
            double bill = patient.calculateBill();  // Calculate bill
            System.out.println("Bill: " + bill);

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println("Medical Records:\n" + medicalRecord.viewRecords()); // View medical records
            }

            System.out.println("---------------------------------");
        }
    }
}
