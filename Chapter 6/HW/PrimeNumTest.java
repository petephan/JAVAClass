/*
List out all prime numbers from 2-200
Peter Phan 10/1/2014
 */

public class PrimeNumTest {
    
    public static void main( String[] args ) 
   {
    String result;
      System.out.print("Prime numbers between 2 and 100 are: ");

      for ( int i = 2; i <= 100; i++ )
      {
      if (prime(i) == true)
          System.out.printf("%s ",i);
      }
   }
    public static boolean prime( int n )
        {
        for ( int j = 2; j <= n - 1; j++ )
        if ( n % j == 0 )
            return false;

        return true;
        }
}