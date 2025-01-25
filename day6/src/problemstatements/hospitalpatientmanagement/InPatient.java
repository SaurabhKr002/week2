package problemstatements.hospitalpatientmanagement;

// InPatient class extending Patient and implementing MedicalRecord
public class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;
    private int numberOfDays;

    // Constructor
    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, int numberOfDays) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
        this.numberOfDays = numberOfDays;
    }

    // Implement calculateBill for InPatient
    @Override
    public double calculateBill() {
        double dailyRate = 1500;  // Daily room charge for in-patient
        double totalBill = dailyRate * numberOfDays;
        return totalBill;
    }

    // Implement addRecord to add medical records
    @Override
    public void addRecord(String record) {
        medicalHistory += "\n" + record;
    }

    // Implement viewRecords to view medical history
    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis + "\nMedical History: " + medicalHistory;
    }
}
