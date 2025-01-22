import java.util.ArrayList;

// Define the Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method for easy printing
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Define the Library class
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Demonstrate the aggregation relationship
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Notice that book2 is added to both libraries
        library2.addBook(book3);

        // Display books in each library
        System.out.println("Library 1:");
        library1.displayBooks();

        System.out.println("Library 2:");
        library2.displayBooks();
    }
}
