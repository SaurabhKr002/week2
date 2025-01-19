class Book {
    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Default Constructor
    public Book() {
        this.ISBN = "000-0000000000";
        this.title = "Untitled";
        this.author = "Unknown";
    }

    // Parameterized Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get author name
    public String getAuthor() {
        return author;
    }

    // Public method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSizeMB;

    // Default Constructor
    public EBook() {
        super();
        this.fileSizeMB = 0.0;
    }

    // Parameterized Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        displayBookDetails();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        // Creating Book instance
        Book book = new Book("123-4567890123", "Effective Java", "Joshua Bloch");
        book.displayBookDetails();
        book.setAuthor("Joshua J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());

        // Creating EBook instance
        EBook ebook = new EBook("456-7890123456", "Java Concurrency in Practice", "Brian Goetz", 5.5);
        System.out.println("\nE-Book Details:");
        ebook.displayEBookDetails();
    }
}
