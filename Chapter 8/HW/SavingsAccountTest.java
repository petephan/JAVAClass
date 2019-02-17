/*
 * 8.6: Creating Savings Account to calculate interest
 * Peter Phan 10/25/14
 */
package Chapter8;

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.print(saver1.toString());

        for (int month = 1; month <= 12; ++month) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.printf("\nMonth " + month + ":\t" + "$%.2f" + "\t" + "$%.2f", saver1.getCalculateMonthlyInterest(), saver2.getCalculateMonthlyInterest());
        }

        SavingsAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print(saver2.toString());

    }
}
