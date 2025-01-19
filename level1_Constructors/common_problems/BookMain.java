// Book.java
class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display Book Details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
    }
}

// Main.java
public class BookMain {
    public static void main(String[] args) {
        // Default Constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBookDetails();

        // Parameterized Constructor
        Book paramBook = new Book("An Idealist View of Life", "Dr. S. Radhakrishnan", 969.69);
        System.out.println("\nParameterized Book:");
        paramBook.displayBookDetails();
    }
}
