// Fig. 11.5: UsingExceptions.java
// try...catch...finally exception handling mechanism.

public class UsingExceptions 
{
   public static void main( String[] args )
   {
     
         throwExceptionA(); // call method throwException
	     throwExceptionB();
		 throwNullPointer();
		 throwIOException();
     
   } // end main

   // demonstrate try...catch
   public static void throwExceptionA() // throw ExceptionA
   {
      try // throw an exception and immediately catch it
      { 
         //System.out.println( "Method throwException" );
         throw new ExceptionA(); // generate exception
      } // end try
      catch ( ExceptionA exception ) // catch exception thrown in try
      {
         System.err.printf("Exception: %s \n", exception);
         System.err.println ("ExceptionA handled in method throwExceptionA \n" );
         //throw exception; // rethrow for further processing

      } // end catch   
   } // end method throwExceptionA
   public static void throwExceptionB()
   {
   //TODO: add code to handle ExceptionB similar to above
   }
   public static void throwNullPointer()
   {
   //TODO: add code to handle NullPointer similar to above
   }
    public static void throwIOException()
   {
   //TODO: add code to handle IOException similar to above, need to import java.io.IOException
   }
} // end class UsingExceptions


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
