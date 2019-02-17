/*
 * 8.6: Creating Savings Account to calculate interest
 * Peter Phan 10/25/14
 */
package Chapter8;

public class SavingsAccount {

    public double savingsBalance;
    private static double annualInterestRate = 0;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * (annualInterestRate / 12.0);
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = (newRate >= 0 && newRate <= 1.0) ? newRate : 0.04;
    }

    public double getCalculateMonthlyInterest() {
        return savingsBalance;
    }

    public String toString() {

        return String.format("\nMonthly balances for one year at .04" + "\nBalances: \n\t\tSaver 1 " + "\tSaver 2\nBase\t\t" 
                + "$%.2f" + "\t" + "$%.2f", getCalculateMonthlyInterest(), getCalculateMonthlyInterest());
    }
}
