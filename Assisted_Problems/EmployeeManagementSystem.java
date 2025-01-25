package Assisted_Problems;

// Base class representing a generic Employee
class Employee {

    // Class attributes
    private String name; // Name of the employee
    private String id; // Employee ID
    private double salary; // Employee salary

    // Default constructor
    Employee() {}

    // Parameterized constructor
    Employee(String name, String id, double salary) {
        // Initialize attributes using constructor parameters
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: INR " + salary);
    }
}

// Subclass representing a Manager
class Manager extends Employee {

    // Additional attribute specific to Manager
    private int teamSize; // Number of team members managed

    // Constructor for Manager class
    public Manager(String name, String id, double salary, int size) {
        // Call the superclass constructor to initialize common attributes
        super(name, id, salary);
        this.teamSize = size; // Initialize teamSize
    }

    // Method overriding: Add team-specific details for Manager
    @Override
    public void displayDetails() {
        // Call superclass method to display common details
        super.displayDetails();
        System.out.println("Employee team size: " + teamSize);
    }
}

// Subclass representing a Developer
class Developer extends Employee {

    // Additional attribute specific to Developer
    private String programmingLanguage; // Primary programming language

    // Constructor for Developer class
    public Developer(String name, String id, double salary, String programmingLanguage) {
        // Call the superclass constructor to initialize common attributes
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage; // Initialize programmingLanguage
    }

    // Method overriding: Add programming language details for Developer
    @Override
    public void displayDetails() {
        // Call superclass method to display common details
        super.displayDetails();
        System.out.println("Employee programming language: " + programmingLanguage);
    }
}

// Subclass representing an Intern
class Intern extends Employee {

    // Additional attribute specific to Intern
    private int observationPeriod; // Observation period in months

    // Constructor for Intern class
    public Intern(String name, String id, double salary, int observationPeriod) {
        // Call the superclass constructor to initialize common attributes
        super(name, id, salary);
        this.observationPeriod = observationPeriod; // Initialize observationPeriod
    }

    // Method overriding: Add observation period details for Intern
    @Override
    public void displayDetails() {
        // Call superclass method to display common details
        super.displayDetails();
        System.out.println("Employee Observation Period: " + observationPeriod + " months");
    }
}

// Main class to execute the program
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        // Create a generic Employee instance
        Employee newEmployee = new Employee("Employee name", "Capg000", 0);
        
        // Create a Manager instance
        Manager newManager = new Manager("Anand Soni", "Capg001", 75000, 10);
        
        // Create a Developer instance
        Developer newDeveloper = new Developer("Saurabh Kumar", "Capg002", 25000, "Java");
        
        // Create an Intern instance
        Intern newIntern = new Intern("Amit Kumar", "Capg003", 15000, 6);
        
        // Display details of each employee type
        System.out.println("______________________________________");
        newEmployee.displayDetails(); // Display generic employee details
        System.out.println("______________________________________");
        newManager.displayDetails(); // Display Manager details
        System.out.println("______________________________________");
        newDeveloper.displayDetails(); // Display Developer details
        System.out.println("______________________________________");
        newIntern.displayDetails(); // Display Intern details
        System.out.println("______________________________________");
    }
}
