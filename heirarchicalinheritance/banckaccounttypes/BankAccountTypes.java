package heirarchicalinheritance.banckaccounttypes;

// Public main class for demonstrating the hierarchical inheritance
public class BankAccountTypes {
    public static void main(String[] args) {
        // Creating instances of different account types
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 1500.00, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA12345", 1000.00, 500.00);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA12345", 10000.00, 12);

        // Displaying details of each account
        System.out.println("Details of Savings Account:");
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        System.out.println("\nDetails of Checking Account:");
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        System.out.println("\nDetails of Fixed Deposit Account:");
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
