// Exercises 3.14 Template: EmployeeTest.java
// Application to test class Employee.
// Peter Phan 9/14/2014

import java.util.Scanner;

public class EmployeeTest
{
   public static void main( String[] args )
   {
      Employee employee1 = new Employee("First","Last",0.00); // create Employee object
      Employee employee2 = new Employee("First","Last",0.00);
      
      Scanner input = new Scanner( System.in );
      
      String fName;
      String lName;
      double monthSalary = 0;

      //Employee 1
      System.out.print( "\nEnter Employee 1 First Name: " ); // prompt 
      fName = input.nextLine();
      employee1.setFirstName( fName );
      System.out.print( "Enter Employee 1 Last Name: " );
      lName = input.nextLine();
      employee1.setLastName( lName );
      System.out.print( "Enter Employee 1 Monthly Salary: " );
      monthSalary = input.nextDouble();
      employee1.setMonthlySalary( monthSalary );
      
      System.out.printf( "Employee 1: %s ", employee1.getFirstName() );
      System.out.printf( "%s; ", employee1.getLastName() );
      System.out.printf( "Yearly Salary: $%.2f\n", employee1.getMonthlySalary() );
      employee1.setMonthlySalary( monthSalary );
      System.out.printf( "Yearly Salary After 10%% Raise: $%.2f\n", employee1.getSalaryRaise() );
      
      //Employee 2
      System.out.print( "\nEnter Employee 2 First Name: " ); // prompt 
      fName = input.next();
      employee2.setFirstName( fName );
      System.out.print( "Enter Employee 2 Last Name: " );
      lName = input.next();
      employee2.setLastName( lName );
      System.out.print( "Enter Employee 2 Monthly Salary: " );
      monthSalary = input.nextDouble();
      employee2.setMonthlySalary( monthSalary );
      
      System.out.printf( "Employee 2: %s ", employee2.getFirstName() );
      System.out.printf( "%s; ", employee2.getLastName() );
      System.out.printf( "Yearly Salary: $%.2f\n", employee2.getMonthlySalary() );
      employee2.setMonthlySalary( monthSalary );
      System.out.printf( "Yearly Salary After 10%% Raise: $%.2f\n", employee2.getSalaryRaise() );
   
      /*
      //10% raise
      System.out.println( "\nIncreasing employee salaries by 10%" );
      System.out.printf( "Employee 1: %s ", employee1.getFirstName() );
      System.out.printf( "%s; ", employee1.getLastName() );
      employee1.setMonthlySalary( monthSalary );
      System.out.printf( "Yearly Salary: $%.2f\n", employee1.getSalaryRaise() );
      System.out.printf( "Employee 2: %s ", employee2.getFirstName() );
      System.out.printf( "%s; ", employee2.getLastName() );
      employee2.setMonthlySalary( monthSalary );
      System.out.printf( "Yearly Salary: $%.2f\n", employee2.getSalaryRaise() );
*/
   } // end main
} // end class InvoiceTest

