class Student {
    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Default Constructor
    public Student() {
        this.rollNumber = 0;
        this.name = "Unnamed";
        this.CGPA = 0.0;
    }

    // Parameterized Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Public method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    // Default Constructor
    public PostgraduateStudent() {
        super();
        this.researchTopic = "Unknown";
    }

    // Parameterized Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        displayStudentDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // Creating Student instance
        Student student = new Student(101, "Rahul", 9.5);
        student.displayStudentDetails();

        // Modifying and accessing CGPA
        student.setCGPA(9.7);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Creating PostgraduateStudent instance
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Sneha", 9.8, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateStudentDetails();
    }
}
