package heirarchicalinheritance.schoolsystemroles;

// Subclass representing a staff member
class Staff extends Person {
    private String department; // Department of the staff member

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Call the constructor of the parent class
        this.department = department;
    }

    // Method to display the role of the person
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Method to display staff-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
