import java.util.ArrayList;

// Define the Employee class
class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Position: " + position;
    }
}

// Define the Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display employees in the department
    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

// Define the Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display departments and their employees
    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
}

// Demonstrate the composition relationship
public class CompanyAndDepartment {
    public static void main(String[] args) {
        // Create company
        Company company = new Company("Capgemini");

        // Create departments
        Department department1 = new Department("Engineering");
        Department department2 = new Department("Human Resources");

        // Create employees
        Employee employee1 = new Employee("Saurabh Kumar", "Software Engineer");
        Employee employee2 = new Employee("Anand Soni", "Project Manager");
        Employee employee3 = new Employee("Shreya Singh", "HR Manager");
        Employee employee4 = new Employee("Amit Kumar", "Recruiter");

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);

        // Add departments to company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display departments and their employees
        company.displayDepartments();

        // The company object goes out of scope here, leading to the deletion
        // of all associated departments and employees
    }
}
