class Book {
    // Fields (Attributes)
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price+"/-");
    }
}

public class BookDetailsMain {
    public static void main(String[] args) {
        // Create Book object
        Book book = new Book("Harry Potter Series", "J.K. Rowling", 999.99);

        // Display details of the book
        book.displayDetails();
    }
}
