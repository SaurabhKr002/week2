package problemstatements.ecommerceplatform;

// Electronics product category
class Electronics extends Product implements Taxable {
    private double discountRate = 0.15; // 15% discount
    private double taxRate = 0.18; // 18% GST

    // Constructor to initialize electronics product details
    public Electronics(int productId, String name, double price) {
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
        return "GST at 18%";
    }
}
