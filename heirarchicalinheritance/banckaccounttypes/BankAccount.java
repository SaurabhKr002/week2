package heirarchicalinheritance.banckaccounttypes;

// Base class for bank accounts
class BankAccount {
    protected String accountNumber; // Account number for the bank account
    protected double balance;       // Current balance in the account

    // Constructor for the BankAccount class
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
