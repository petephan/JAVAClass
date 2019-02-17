/*
Convert Celcius to Fahrenheit and vice versa
Peter Phan 10/1/2014
 */

import java.util.Scanner;

public class ConvertT {
    
 public static void main (String[] args) 
   {
      Scanner input = new Scanner( System.in );
      
      int option;
      int temperature = 0;
      double result;

      System.out.println( "1. Fahrenheit to Celsius" );
      System.out.println( "2. Celsius to Fahrenheit" );
      System.out.println( "3. Exit" );
      System.out.print( "Choice: " );
      option = input.nextInt();
              
      if (option == 3)
      {    
            System.exit(0);
      }
      
      System.out.print( "Enter temperature: " );
      temperature = input.nextInt();
      
      if (option == 1)
      {    
        result = fahrenheitToCelsius(temperature);
        
            System.out.print( temperature + " Fahrenheit is ");
            System.out.printf( "%.0f",result);
            System.out.println(" Celsius");
      }
      
      if (option == 2)
      {    
        result = celsiusToFahrenheit(temperature);
        
            System.out.print( temperature + " Celsius is ");
            System.out.printf( "%.0f",result);
            System.out.println(" Fahrenheit");
      }
   }

   public static double fahrenheitToCelsius( int fahrenheitA )
   {
      double celsiusA;
      
      celsiusA = 5.0 / 9.0 * (fahrenheitA - 32);

      return celsiusA;
   }
   
   public static double celsiusToFahrenheit( int celsiusB )
   {
      double fahrenheitB;
      
      fahrenheitB = 9.0 / 5.0 * celsiusB + 32;

      return fahrenheitB;
   }
}
