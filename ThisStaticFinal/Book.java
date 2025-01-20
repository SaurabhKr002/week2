public class Book {
    // Static variable shared across all books
    private static String libraryName = "City Library";
    
    // Final variable to ensure it cannot be changed once assigned
    private final String isbn;
    
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Check if the object is an instance of Book
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Display library name
        Book.displayLibraryName();

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}


//p2