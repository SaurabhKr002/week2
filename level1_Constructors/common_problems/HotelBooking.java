class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1);
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Getters
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setters
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Display Booking Details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Default Constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Parameterized Constructor
        HotelBooking paramBooking = new HotelBooking("Saurabh Kumar", "Deluxe", 3);
        System.out.println("\nParameterized Booking:");
        paramBooking.displayBookingDetails();

        // Copy Constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("\nCopy Booking:");
        copyBooking.displayBookingDetails();
    }
}
