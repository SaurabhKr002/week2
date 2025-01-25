package problemstatements.bankingsystem;

// Interface Loanable
public interface Loanable {
    void applyForLoan(double loanAmount);
    boolean calculateLoanEligibility();
}
