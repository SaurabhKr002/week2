package problemstatements.librarymanagementsystem;

// Book class extending LibraryItem and implementing Reservable
public class Book extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isAvailable;

    // Constructor
    public Book(String itemId, String title, String author, String borrowerName) {
        super(itemId, title, author);
        this.borrowerName = borrowerName;
        this.isAvailable = true;
    }

    // Implement getLoanDuration for Book
    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for books
    }

    // Implement reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Book reserved by " + borrowerName);
            isAvailable = false;
        } else {
            System.out.println("Book is currently unavailable for reservation.");
        }
    }

    // Implement checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
