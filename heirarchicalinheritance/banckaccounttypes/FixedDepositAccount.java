package heirarchicalinheritance.banckaccounttypes;

// Subclass representing a Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Term of deposit in months

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance); // Call the constructor of the parent class
        this.depositTerm = depositTerm;
    }

    // Method to display the type of account
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }

    // Method to display account-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
