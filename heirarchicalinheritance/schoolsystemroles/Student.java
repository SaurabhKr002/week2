package heirarchicalinheritance.schoolsystemroles;

// Subclass representing a student
class Student extends Person {
    private String grade; // Grade of the student

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Call the constructor of the parent class
        this.grade = grade;
    }

    // Method to display the role of the person
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Method to display student-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
