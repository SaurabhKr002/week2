package heirarchicalinheritance.schoolsystemroles;

// Subclass representing a teacher
class Teacher extends Person {
    private String subject; // Subject taught by the teacher

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the constructor of the parent class
        this.subject = subject;
    }

    // Method to display the role of the person
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Method to display teacher-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}
