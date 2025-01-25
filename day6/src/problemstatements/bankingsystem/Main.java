package problemstatements.bankingsystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the Banking System
public class Main {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add different types of bank accounts
        accounts.add(new SavingsAccount("S123", "Saurabh Kumar", 15000, 6.0));
        accounts.add(new CurrentAccount("C456", "Kuldeep Chaturvedi", 8000, 1000));

        // Display details of each account and calculate interest
        System.out.println("----- Banking System -----");
        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000); // Example loan amount
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println("---------------------------------");
        }
    }
}
