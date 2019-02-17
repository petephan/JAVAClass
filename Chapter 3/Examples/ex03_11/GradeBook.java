// Exercise 3.11 Solution: GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName; // name of course's instructor 

   // constructor initializes courseName with String supplied as argument
   public GradeBook( String course, String instructor )
   {
      courseName = course; // initializes courseName
      instructorName = instructor; // initializes instructorName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // method to set the instructor name
   public void setInstructorName( String name )
   {
      instructorName = name; // store the instructor name
   } // end method setInstructorName

   // method to retrieve the instructor name
   public String getInstructorName()
   {
      return instructorName;
   } // end method getInstructorName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // output the course name and instructor name
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
      System.out.printf( "This course is presented by: %s\n", 
         getInstructorName() );
   } // end method displayMessage
} // end class GradeBook


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
