package problemstatements.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the e-commerce platform
public class Main {
    public static void main(String[] args) {
        // Creating a list of products
        List<Product> products = new ArrayList<>();

        // Adding products to the list
        products.add(new Electronics(101, "Smartphone", 30000));
        products.add(new Clothing(102, "T-Shirt", 500));
        products.add(new Groceries(103, "Rice", 1000));

        // Displaying details of each product with final price calculation
        System.out.println("----- Product Details -----");
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println("Tax Details: " + ((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
