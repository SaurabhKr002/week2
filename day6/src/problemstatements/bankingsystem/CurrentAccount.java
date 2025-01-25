package problemstatements.bankingsystem;

// CurrentAccount class extending BankAccount and implementing Loanable
public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Implement calculateInterest for CurrentAccount
    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // Flat 5% interest rate for current accounts
    }

    // Implement applyForLoan
    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan of " + loanAmount + " applied for Current Account");
    }

    // Implement calculateLoanEligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Minimum balance requirement for loan eligibility
    }
}
