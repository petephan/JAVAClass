// Exercise 3.11 Solution: GradeBookTest.java
// GradeBook constructor used to specify the course name and 
// instructor name at the time each GradeBook object is created.

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   { 
      // create GradeBook object
      GradeBook gradeBook1 = new GradeBook( 
         "CS101 Introduction to Java Programming", "Sam Smith" ); 
      
      gradeBook1.displayMessage(); // display welcome message

      System.out.println( "\nChanging instructor name to Judy Jones\n" );
      gradeBook1.setInstructorName( "Judy Jones" ); 

      gradeBook1.displayMessage(); // display welcome message
   } // end main
} // end class GradeBookTest


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
