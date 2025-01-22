import java.util.ArrayList;

// Define the Faculty class
class Faculty {
    private String name;
    private String title;

    // Constructor
    public Faculty(String name, String title) {
        this.name = name;
        this.title = title;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    // toString method for easy printing
    
    public String toString() {
        return "Faculty Name: " + name + ", Title: " + title;
    }
}

// Define the Department class
class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to get the department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Method to display faculty members in the department
    public void displayFaculty() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty);
        }
    }
}

// Define the University class
class University {
    private String universityName;
    private ArrayList<Department> departments;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display departments and their faculty members
    public void displayDepartments() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayFaculty();
        }
    }
}

// Demonstrate the relationships
public class UniversityAndDepartments {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Technocrats Group of Institutions");

        // Create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Electrical Engineering");

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Saurabh Kumar", "Professor");
        Faculty faculty2 = new Faculty("Dr. Anand Soni", "Associate Professor");
        Faculty faculty3 = new Faculty("Dr. Rahul Kumar", "Assistant Professor");
        Faculty faculty4 = new Faculty("Dr. Shreya Singh", "Lecturer");

        // Add faculty members to departments
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty3);
        department2.addFaculty(faculty2);
        department2.addFaculty(faculty4);

        // Add departments to university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Display departments and their faculty members
        university.displayDepartments();

        // Note that faculty members can exist independently of departments
        System.out.println("Independent Faculty Member:");
        Faculty independentFaculty = new Faculty("Dr. Independent", "Professor");
        System.out.println(independentFaculty);
    }
}
