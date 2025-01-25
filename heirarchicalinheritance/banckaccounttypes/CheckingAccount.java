package heirarchicalinheritance.banckaccounttypes;

// Subclass representing a Checking Account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Withdrawal limit for the checking account

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the constructor of the parent class
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display the type of account
    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }

    // Method to display account-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}
