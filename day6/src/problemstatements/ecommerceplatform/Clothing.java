package problemstatements.ecommerceplatform;

// Clothing product category
class Clothing extends Product implements Taxable {
    private double discountRate = 0.10; // 10% discount
    private double taxRate = 0.05; // 5% GST

    // Constructor to initialize clothing product details
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementation of calculateDiscount()
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    // Implementation of calculateTax()
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Implementation of getTaxDetails()
    @Override
    public String getTaxDetails() {
        return "GST at 5%";
    }
}
