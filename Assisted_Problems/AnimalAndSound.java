package Assisted_Problems;
// Superclass
class Animal {
    
    // Class attributes
    private String name; // Attribute to store the name of the animal
    private int age; // Attribute to store the age of the animal
    
    // Default constructor
    public Animal() {}
    
    // Parameterized constructor
    public Animal(String name, int age) {
        // Initialize the attributes using constructor parameters
        this.name = name;
        this.age = age;
    }
    
    // Method to display animal sound (default behavior)
    void makeSound() {
        System.out.println("Animal makes Sound");
    }
    
    // Method to display the name and age of the animal
    public void displayDetails() {
        System.out.println("Animal name is: " + name + " and age is: " + age);
    }
}

// Subclass representing a Dog
class Dog extends Animal {
    
    // Constructor for Dog class
    public Dog(String name, int age) {
        // Call the superclass constructor to initialize name and age
        super(name, age);
    }
    
    // Method overriding: Provide specific sound behavior for Dog
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass representing a Cat
class Cat extends Animal {
    
    // Constructor for Cat class
    public Cat(String name, int age) {
        // Call the superclass constructor to initialize name and age
        super(name, age);
    }
    
    // Method overriding: Provide specific sound behavior for Cat
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Subclass representing a Bird
class Bird extends Animal {
    
    // Constructor for Bird class
    public Bird(String name, int age) {
        // Call the superclass constructor to initialize name and age
        super(name, age);
    }
    
    // Method overriding: Provide specific sound behavior for Bird
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

// Main class to execute the program
public class AnimalAndSound {
    public static void main(String[] args) {
        
        // Create an instance of the Animal class
        Animal myAnimal1 = new Animal("Name", 0);
        
        // Create an instance of the Dog class
        Dog myDog1 = new Dog("Husky", 5);
        
        // Create an instance of the Cat class
        Cat myCat1 = new Cat("Persian", 2);
        
        // Create an instance of the Bird class
        Bird myBird1 = new Bird("Parrot", 3);
        
        // Display details and sound for the generic Animal
        myAnimal1.displayDetails();
        myAnimal1.makeSound();
        
        // Display details and sound for the Dog
        myDog1.displayDetails();
        myDog1.makeSound();
        
        // Display details and sound for the Cat
        myCat1.displayDetails();
        myCat1.makeSound();
        
        // Display details and sound for the Bird
        myBird1.displayDetails();
        myBird1.makeSound();
    }
}
