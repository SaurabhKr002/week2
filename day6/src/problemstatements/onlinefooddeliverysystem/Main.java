package problemstatements.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Online Food Delivery System
public class Main {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> foodItems = new ArrayList<>();

        // Add different types of food items
        foodItems.add(new VegItem("Paneer Butter Masala", 250, 2, true));  // Veg item with discount
        foodItems.add(new NonVegItem("Chicken Biryani", 350, 1, false)); // Non-veg item without discount
        foodItems.add(new VegItem("Mushroom curry", 200, 3, false));  // Veg item without discount
        foodItems.add(new NonVegItem("Prawns", 700, 2, true)); // Non-veg item with discount

        // Display details of each food item and calculate total price
        System.out.println("----- Online Food Delivery System -----");
        double totalOrderPrice = 0;

        for (FoodItem foodItem : foodItems) {
            foodItem.getItemDetails();
            double totalPrice = foodItem.calculateTotalPrice();  // Calculate total price
            totalOrderPrice += totalPrice;
            System.out.println("Total Price for " + foodItem.getItemName() + ": " + totalPrice);

            if (foodItem instanceof Discountable) {
                Discountable discountable = (Discountable) foodItem;
                System.out.println(discountable.getDiscountDetails()); // Display discount details
            }

            System.out.println("---------------------------------");
        }

        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}
