class Employee {
    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Default Constructor
    public Employee() {
        this.employeeID = 0;
        this.department = "Unknown";
        this.salary = 0.0;
    }

    // Parameterized Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: INR " + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    // Default Constructor
    public Manager() {
        super();
        this.teamName = "Unknown";
    }

    // Parameterized Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Name: " + teamName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating Employee instance
        Employee employee = new Employee(101, "IT", 60000.0);
        employee.displayEmployeeDetails();

        // Modifying and accessing salary
        employee.setSalary(65000.0);
        System.out.println("Updated Salary: INR " + employee.getSalary());

        // Creating Manager instance
        Manager manager = new Manager(201, "IT", 90000.0, "Development Team");
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
