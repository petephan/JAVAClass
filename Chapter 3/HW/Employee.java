// Exercises 3.14 Template: Employee.java
// Employee class.
// Peter Phan 9/14/2014

public class Employee
{
   private String firstName;
   private String lastName;
   private double monthlySalary;

   // three-argument constructor
   public Employee( String first, String last, double salary )
   {
      firstName = first;
      lastName = last;
      monthlySalary = salary;	  
   }

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   }

   // get last name
   public String getFirstName()
   {
      return firstName;
   }

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   }
   
   // get part number
   public String getLastName()
   {
      return lastName;
   }
   
   // get Monthly Salary
   public void setMonthlySalary ( double salary )
   {
      monthlySalary = salary;
   }
   public double getMonthlySalary()
   {
    if ( monthlySalary > 0 ) 
        monthlySalary = monthlySalary * 12;
            return monthlySalary;
   }
   
   public double getSalaryRaise()
   {
    monthlySalary = (monthlySalary * 12) * 1.1;
    return monthlySalary;
   }
   
} // end class Employee
