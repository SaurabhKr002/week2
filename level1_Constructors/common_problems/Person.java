class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        this("Unknown", 0); // Constructor chaining to set default values
    }

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display the person's details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 30);
        Person clonedPerson = new Person(originalPerson);

        originalPerson.display();
        clonedPerson.display();
    }
}
