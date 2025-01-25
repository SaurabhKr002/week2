package problemstatements.bankingsystem;

// SavingsAccount class extending BankAccount and implementing Loanable
public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Implement calculateInterest for SavingsAccount
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    // Implement applyForLoan
    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan of " + loanAmount + " applied for Savings Account");
    }

    // Implement calculateLoanEligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Minimum balance requirement for loan eligibility
    }
}
