package problemstatements.hospitalpatientmanagement;

// OutPatient class extending Patient and implementing MedicalRecord
public class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;
    private double consultationFee;

    // Constructor
    public OutPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double consultationFee) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
        this.consultationFee = consultationFee;
    }

    // Implement calculateBill for OutPatient
    @Override
    public double calculateBill() {
        double consultationRate = 500;  // Consultation fee for out-patient
        return consultationRate + consultationFee;
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
