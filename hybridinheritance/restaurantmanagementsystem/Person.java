package hybridinheritance.restaurantmanagementsystem;

// Base class representing a generic person
class Person {
    private String name;
    private int id;

    // Constructor to initialize person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
