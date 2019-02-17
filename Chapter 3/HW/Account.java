/*
Fig. 3.13: Account.java
Account class with a constructor to validate and 
initialize instance variable balance of type double.
Peter Phan 9-11-14
 */


public class Account
{   
   private double balance; // instance variable that stores the balance

   // constructor  
   public Account( double initialBalance )
   {
      // validate that initialBalance is greater than 0.0; 
      // if it is not, balance is initialized to the default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   } // end Account constructor

   /*
   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance = balance + amount; // add amount to balance 
   } // end method credit
   */
   
      // debit (subtract) an amount to the account that doesn't exceed the Account's balance
   public void debit( double amount )
   {      
        balance = balance - amount; // subtract amount to balance 
   } // end method credit

   // return the account balance
   public double getBalance()
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance
} // end class Account