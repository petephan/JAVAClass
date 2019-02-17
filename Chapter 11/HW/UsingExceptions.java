/*
UsingExceptions
Peter Phan 11/13/14
 */

import java.io.IOException;


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
         System.err.printf("%s \n", exception);
//         System.err.println ("ExceptionA handled in method throwExceptionA \n" );
         //throw exception; // rethrow for further processing

      } // end catch   
   } // end method throwExceptionA
   public static void throwExceptionB()
   {
      try
      { 
         throw new ExceptionB();
      }
      catch ( ExceptionB exception2 )
      {
         System.err.printf("%s \n", exception2);
//         System.err.println ("ExceptionA handled in method throwExceptionB \n" );
      }
   }
   public static void throwNullPointer()
   {
        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            System.err.printf("%s \n", exception);
//            System.err.println("NullPointerException handled in method throwNullPointerException \n");
        }
   }
    public static void throwIOException()
   {
        try {
            throw new IOException();
        } catch (IOException exception) {
            System.err.printf("%s \n", exception);
//            System.err.println("IOException handled in method throwIOException \n");
        }
   }
}