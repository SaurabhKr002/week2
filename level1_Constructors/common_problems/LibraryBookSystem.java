class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default Constructor
    public LibraryBookSystem() {
        this("Untitled", "Unknown", 0.0, true);
    }

    // Parameterized Constructor
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
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

    public boolean isAvailable() {
        return isAvailable;
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

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating books
        LibraryBookSystem defaultBook = new LibraryBookSystem();
        LibraryBookSystem paramBook = new LibraryBookSystem("The Great Gatsby", "F. Scott Fitzgerald", 499.99, true);

        // Displaying book details
        System.out.println("Default Book:");
        defaultBook.displayBookDetails();

        System.out.println("\nParameterized Book:");
        paramBook.displayBookDetails();

        // Borrowing a book
        System.out.println("\nAttempt to borrow \"The Great Gatsby\":");
        paramBook.borrowBook();

        System.out.println("\nAttempt to borrow \"The Great Gatsby\" again:");
        paramBook.borrowBook();
    }
}
