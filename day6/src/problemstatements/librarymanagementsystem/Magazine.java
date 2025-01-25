package problemstatements.librarymanagementsystem;

// Magazine class extending LibraryItem and implementing Reservable
public class Magazine extends LibraryItem implements Reservable {
    private String issueNumber;
    private boolean isAvailable;

    // Constructor
    public Magazine(String itemId, String title, String author, String issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.isAvailable = true;
    }

    // Implement getLoanDuration for Magazine
    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }

    // Implement reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Magazine reserved: " + title + " (Issue: " + issueNumber + ")");
            isAvailable = false;
        } else {
            System.out.println("Magazine is currently unavailable for reservation.");
        }
    }

    // Implement checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
