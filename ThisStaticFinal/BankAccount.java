public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Bank of Baroda";
    
    // Static variable to keep track of the total number of accounts
    private static int totalAccounts = 0;
    
    // Final variable to ensure it cannot be changed once assigned
    private final int accountNumber;
    
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
		
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Check if the object is an instance of BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Saurabh Kumar", 123111036, 50000.0);
        BankAccount account2 = new BankAccount("Anand Soni", 123111048, 30000.0);

        account1.deposit(15000.0);
        account2.withdraw(5000.0);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}


//p1