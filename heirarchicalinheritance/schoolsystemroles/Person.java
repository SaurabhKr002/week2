package heirarchicalinheritance.schoolsystemroles;

// Base class representing a person in the school system
class Person {
    protected String name; // Name of the person
    protected int age;     // Age of the person

    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
