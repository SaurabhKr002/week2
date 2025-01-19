class BankAccount {
    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Default Constructor
    public BankAccount() {
        this.accountNumber = "0000000000";
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: INR " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Default Constructor
    public SavingsAccount() {
        super();
        this.interestRate = 0.0;
    }

    // Parameterized Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating BankAccount instance
        BankAccount account = new BankAccount("1234567890", "Rohan Sharma", 25000.0);
        account.displayAccountDetails();

        // Modifying and accessing balance
        account.setBalance(27500.0);
        System.out.println("Updated Balance: INR " + account.getBalance());

        // Creating SavingsAccount instance
        SavingsAccount savings = new SavingsAccount("9876543210", "Sneha Verma", 50000.0, 4.5);
        System.out.println("\nSavings Account Details:");
        savings.displaySavingsAccountDetails();
    }
}
