package problemstatements.onlinefooddeliverysystem;

// NonVegItem class extending FoodItem and implementing Discountable
public class NonVegItem extends FoodItem implements Discountable {
    private boolean isOnDiscount;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity, boolean isOnDiscount) {
        super(itemName, price, quantity);
        this.isOnDiscount = isOnDiscount;
    }

    // Implement calculateTotalPrice for NonVegItem
    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        if (isOnDiscount) {
            totalPrice *= 0.85;  // 15% discount for non-veg items on discount
        }
        totalPrice += 20;  // Additional charge for non-veg items
        return totalPrice;
    }

    // Implement applyDiscount
    @Override
    public double applyDiscount() {
        return isOnDiscount ? 0.15 : 0;  // 15% discount if applicable
    }

    // Implement getDiscountDetails
    @Override
    public String getDiscountDetails() {
        return isOnDiscount ? "This item has a 15% discount." : "No discount available for this item.";
    }
}
