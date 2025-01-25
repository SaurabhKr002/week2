package problemstatements.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Library Management System
public class Main {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> items = new ArrayList<>();

        // Add different types of library items
        items.add(new Book("B101", "Java Developer's Handbook", "Benjamin J. Evans", "Saurabh Kumar"));
        items.add(new Magazine("M202", "Tech Today", "Mary Smith", "Issue 15"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan", "Blu-ray"));

        // Display details of each library item and handle reservations
        System.out.println("----- Library Management System -----");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem();  // Reserve the item
                System.out.println("Available for reservation: " + reservable.checkAvailability());
            }

            System.out.println("---------------------------------");
        }
    }
}
