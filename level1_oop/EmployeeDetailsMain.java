class EmployeeDetails {
    // Fields (Attributes)
    private String name;
    private int id;
    private double salary;

    // Constructor
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeDetailsMain {
    public static void main(String[] args) {
        // Create EmployeeDetails objects
        EmployeeDetails emp1 = new EmployeeDetails("Saurabh Kumar", 001, 25000.75);
        EmployeeDetails emp2 = new EmployeeDetails("Rahul kumar", 002, 20000.50);

        // Display details of each employee
        System.out.println("=== Employee 1 ===");
        emp1.displayDetails();
        System.out.println("\n=== Employee 2 ===");
        emp2.displayDetails();
    }
}
