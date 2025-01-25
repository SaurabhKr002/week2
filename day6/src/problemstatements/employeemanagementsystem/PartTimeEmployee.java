package problemstatements.employeemanagementsystem;

// Represents a part-time employee
class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String department;

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary()
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
    }

    // Implementation of assignDepartment()
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    // Implementation of getDepartmentDetails()
    @Override
    public String getDepartmentDetails() {
        return department == null ? "No department assigned" : department;
    }

    // Display details including department
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }
}
