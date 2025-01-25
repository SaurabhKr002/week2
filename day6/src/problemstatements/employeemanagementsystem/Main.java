package problemstatements.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the employee management system
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Creating full-time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Amit Kumar", 50000, 20000);
        fullTimeEmployee.assignDepartment("Engineering");

        // Creating part-time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Saurabh Kumar", 20000, 500, 20);
        partTimeEmployee.assignDepartment("Support");

        // Adding employees to the list
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Displaying details of all employees
        System.out.println("----- Employee Details -----");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
