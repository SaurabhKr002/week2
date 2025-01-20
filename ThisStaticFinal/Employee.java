public class Employee {
    // Static variable shared across all employees
    private static String companyName = "Capgemini";
    
    // Static variable to keep track of the total number of employees
    private static int totalEmployees = 0;
    
    // Final variable to ensure it cannot be changed once assigned
    private final int id;
    
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // Check if the object is an instance of Employee
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Saurabh Kumar", 101, "Software Engineer");
        Employee emp2 = new Employee("Anand Soni", 102, "Project Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}


//p3