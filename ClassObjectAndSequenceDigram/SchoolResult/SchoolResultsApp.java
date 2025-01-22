import java.util.ArrayList;
import java.util.List;

// Class to represent a Subject with a name and marks
class Subject {
    private String subjectName;
    private int marks;

    // Constructor to initialize Subject
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Getter for subject name
    public String getSubjectName() {
        return subjectName;
    }
}

// Class to represent a Student with a name, ID, and list of subjects
class Student {
    private String name;
    private String studentID;
    private List<Subject> subjects;

    // Constructor to initialize Student
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getter for the list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }
}

// Class to calculate the grade of a student
class GradeCalculator {
    // Method to calculate the average grade of a student
    public static double calculateGrade(Student student) {
        int totalMarks = 0;

        // Loop through all subjects to sum the marks
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        // Calculate and return the average grade
        return totalMarks / (double) student.getSubjects().size();
    }
}

// Main class to test the application
public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", "12345");

        // Add subjects to the student
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        // Calculate the student's grade
        double grade = GradeCalculator.calculateGrade(student);

        // Print the results
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}
