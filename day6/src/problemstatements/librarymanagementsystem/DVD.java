package problemstatements.librarymanagementsystem;

// DVD class extending LibraryItem and implementing Reservable
public class DVD extends LibraryItem implements Reservable {
    private String format;  // Format: DVD or Blu-ray
    private boolean isAvailable;

    // Constructor
    public DVD(String itemId, String title, String author, String format) {
        super(itemId, title, author);
        this.format = format;
        this.isAvailable = true;
    }

    // Implement getLoanDuration for DVD
    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan duration for DVDs
    }

    // Implement reserveItem
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("DVD reserved: " + title + " (Format: " + format + ")");
            isAvailable = false;
        } else {
            System.out.println("DVD is currently unavailable for reservation.");
        }
    }

    // Implement checkAvailability
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
