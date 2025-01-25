package singleinheritance.librarymanagement;

// Base class representing a generic Book
class Book {

    // Attributes for a book
    private String title; // Title of the book
    private int publicationYear; // Year the book was published

    // Default constructor
    Book() {}

    // Parameterized constructor
    Book(String title, int publicationYear) {
        // Initialize attributes using constructor parameters
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass representing an Author associated with a Book
class Author extends Book {

    // Additional attributes specific to an author
    private String name; // Name of the author
    private String bio; // Short biography of the author

    // Constructor for Author class
    public Author(String title, int publicationYear, String name, String bio) {
        // Call the superclass constructor to initialize book details
        super(title, publicationYear);
        this.name = name; // Initialize author's name
        this.bio = bio; // Initialize author's biography
    }

    // Method overriding: Add author-specific details to the output
    @Override
    public void displayInfo() {
        // Call superclass method to display book details
        super.displayInfo();
        // Display additional details about the author
        System.out.println("Author's name: " + name);
        System.out.println("Author's bio: " + bio);
    }
}

// Main class to execute the program
public class LibraryManagement {
    public static void main(String[] args) {

        // Create a Book instance
        Book book1 = new Book("Book Title", 0000); // Initialize with title and publication year

        // Create an Author instance associated with a specific book
        Author author1 = new Author("xyz", 2002, "abc", "I am an author who writes wonderful books");

        // Display details of the book
        book1.displayInfo();
        System.out.println("______________________________________");

        // Display details of the author, including book details
        author1.displayInfo();
    }
}
