package problemstatements.employeemanagementsystem;

// Represents a full-time employee
class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Implementation of calculateSalary()
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
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
