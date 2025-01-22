import java.util.ArrayList;

// Define the Account class
class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
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
}

// Define the Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

// Define the Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            addCustomer(customer);
        }
        customer.addAccount(account);
    }

    // Method to display all customers and their accounts
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

// Demonstrate the association relationship
public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Create bank
        Bank bank = new Bank("Bank of Baroda");

        // Create customers
        Customer customer1 = new Customer("Saurabh Kumar");
        Customer customer2 = new Customer("Anand Soni");

        // Create accounts
        Account account1 = new Account("A001", 1000.0);
        Account account2 = new Account("A002", 1500.0);
        Account account3 = new Account("A003", 2000.0);

        // Open accounts for customers in the bank
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Display customers and their accounts
        bank.displayCustomers();
    }
}
