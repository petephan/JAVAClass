/*
Fig. 3.14: AccountTest.java
Inputting and outputting floating-point numbers with Account objects.
Peter Phan 9-11-14
 */

import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String[] args ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account( -7.53 ); // create Account object

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
      
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double depositAmount; // deposit amount read from user

      
      System.out.println( "Enter withdraw amount for account1: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", depositAmount );
      if (account1.getBalance() < depositAmount)
         System.out.println( "Debit amount exceeded account balance" );
      if (account1.getBalance() >= depositAmount)
         account1.debit( depositAmount ); // subtract to account1 balance


      // display balances
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

      System.out.print( "Enter withdraw amount for account2: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", depositAmount );
      if (account2.getBalance() < depositAmount)
         System.out.println( "Debit amount exceeded account balance" );
      if (account2.getBalance() >= depositAmount)
         account2.debit( depositAmount ); // subtract to account1 balance

      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
   } // end main
} // end class AccountTest