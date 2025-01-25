package problemstatements.onlinefooddeliverysystem;

// VegItem class extending FoodItem and implementing Discountable
public class VegItem extends FoodItem implements Discountable {
    private boolean isOnDiscount;

    // Constructor
    public VegItem(String itemName, double price, int quantity, boolean isOnDiscount) {
        super(itemName, price, quantity);
        this.isOnDiscount = isOnDiscount;
    }

    // Implement calculateTotalPrice for VegItem
    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        if (isOnDiscount) {
            totalPrice *= 0.9;  // 10% discount for veg items on discount
        }
        return totalPrice;
    }

    // Implement applyDiscount
    @Override
    public double applyDiscount() {
        return isOnDiscount ? 0.1 : 0;  // 10% discount if applicable
    }

    // Implement getDiscountDetails
    @Override
    public String getDiscountDetails() {
        return isOnDiscount ? "This item has a 10% discount." : "No discount available for this item.";
    }
}
