import java.util.ArrayList;

// Define the Course class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to get the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to display enrolled students
    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

// Define the Student class
class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to add a course for the student
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    // Method to get the student name
    public String getName() {
        return name;
    }

    // Method to display enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Define the School class
class School {
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display students and their courses
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            student.displayCourses();
        }
    }
}

// Demonstrate the relationships
public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats School");

        // Create students
        Student saurabh = new Student("Saurabh Kumar");
        Student anand = new Student("Anand Soni");
        Student rahul = new Student("Rahul Kumar");
        Student shreya = new Student("Shreya Singh");

        // Create courses
        Course mathematics = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Enroll students in courses
        saurabh.enrollInCourse(mathematics);
        saurabh.enrollInCourse(physics);
        anand.enrollInCourse(mathematics);
        rahul.enrollInCourse(physics);
        shreya.enrollInCourse(mathematics);

        // Add students to the school
        school.addStudent(saurabh);
        school.addStudent(anand);
        school.addStudent(rahul);
        school.addStudent(shreya);

        // Display students and their courses
        school.displayStudents();

        // Display students enrolled in each course
        mathematics.displayStudents();
        physics.displayStudents();
    }
}
