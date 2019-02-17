// Exercise 2.16
// Compare integers 
// Peter Phan 9/7/2014
import java.util.Scanner; // program uses class Scanner

public class Exercise_2_16
{
   // main method begins execution of Java application
   public static void main( String[] args )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to compare
      int number2; // second number to compare

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user 
       
      if ( number1 < number2 )
         System.out.printf( "%d is larger", number2 );

      if ( number1 > number2 )
         System.out.printf( "%d is larger", number1 );
      
      if ( number1 == number2 ) 
         System.out.println( "These numbers are equal");
   }
} 