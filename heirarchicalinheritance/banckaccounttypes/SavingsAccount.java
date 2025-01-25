package heirarchicalinheritance.banckaccounttypes;

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for savings account

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the constructor of the parent class
        this.interestRate = interestRate;
    }

    // Method to display the type of account
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }

    // Method to display account-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
