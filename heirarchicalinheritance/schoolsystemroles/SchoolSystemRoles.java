package heirarchicalinheritance.schoolsystemroles;

// Public main class for demonstrating the hierarchical inheritance
public class SchoolSystemRoles {
    public static void main(String[] args) {
        // Creating instances of different roles
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Displaying details of each role
        System.out.println("Details of Teacher:");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println("\nDetails of Student:");
        student.displayRole();
        student.displayDetails();

        System.out.println("\nDetails of Staff:");
        staff.displayRole();
        staff.displayDetails();
    }
}
