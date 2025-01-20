public class Student {
    // Static variable shared across all students
    private static String universityName = "Global University";
    
    // Static variable to keep track of the total number of students
    private static int totalStudents = 0;
    
    // Final variable to ensure it cannot be changed once assigned
    private final int rollNumber;
    
    private String name;
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        // Check if the object is an instance of Student
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    // Method to update student's grade
    public void updateGrade(String newGrade) {
        // Check if the object is an instance of Student
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Saurabh Kumar", 101, "A");
        Student student2 = new Student("Rahul Kumar", 102, "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Update student grade
        student1.updateGrade("A+");
        System.out.println("Updated Grade for Saurabh Kumar:");

        student1.displayStudentDetails();

        Student.displayTotalStudents();
    }
}


//p5