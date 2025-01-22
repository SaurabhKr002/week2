import java.util.ArrayList;

// Define the Course class
class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Students> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to get the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
    }

    // Method to display the course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Enrolled Students: ");
        for (Students student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

// Define the Professor class
class Professor {
    private String name;
    private ArrayList<Course> courses;

    // Constructor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to get the professor's name
    public String getName() {
        return name;
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    // Method to display the professor's courses
    public void displayCourses() {
        System.out.println("Professor: " + name);
        for (Course course : courses) {
            System.out.println("Teaching: " + course.getCourseName());
        }
    }
}

// Define the Students class
class Students {
    private String name;
    private ArrayList<Course> courses;

    // Constructor
    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Method to display the student's courses
    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getCourseName());
        }
    }
}

// Demonstrate the relationships
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Saurabh Kumar");
        Professor professor2 = new Professor("Dr. Anand Soni");

        // Create students
        Students student1 = new Students("Rahul Kumar");
        Students student2 = new Students("Kuldeep Chaturvedi");

        // Create courses
        Course course1 = new Course("Computer Science Engineering");
        Course course2 = new Course("AIML");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display professors and their courses
        professor1.displayCourses();
        professor2.displayCourses();

        // Display students and their courses
        student1.displayCourses();
        student2.displayCourses();

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
