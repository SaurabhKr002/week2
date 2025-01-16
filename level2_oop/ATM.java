class BankAccount {
    // Fields (Attributes)
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: INR " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: INR " + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: INR " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount account = new BankAccount("Saurabh Kumar", "1234567890", 5000.00);

        // Deposit money
        account.deposit(2000.00);
        
        // Withdraw money
        account.withdraw(1500.00);
        
        // Attempt to withdraw more money than available
        account.withdraw(6000.00);
        
        // Display final balance
        account.displayBalance();
    }
}
