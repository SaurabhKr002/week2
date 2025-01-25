package problemstatements.ecommerceplatform;

// Groceries product category
class Groceries extends Product {
    private double discountRate = 0.05; // 5% discount

    // Constructor to initialize groceries product details
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementation of calculateDiscount()
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}
