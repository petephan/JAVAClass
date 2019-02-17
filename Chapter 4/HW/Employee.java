/*
4.20 Salary Calculator
Peter Phan 9/18/14
 */

import java.util.Scanner;


public class Employee {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		
        int employeeCounter = 1;
        double hourlyRate;
        double hoursWorked;
        double overtimeRate = 0;
        double grossPay = 0;
        double total = 0;


        while (employeeCounter <= 3)
        {
            System.out.print("Enter hourly rate: "); //prompt
            hourlyRate=input.nextInt(); //read number from user
		
            System.out.print("Enter hours worked: ");
            hoursWorked=input.nextInt();
            
            if (hoursWorked > 40)
                {
                overtimeRate = hourlyRate * 1.5;
                //hours worked + overtime 1.5x rate
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * overtimeRate);
                }
                else
                {
                    grossPay = hourlyRate * hoursWorked;
                }
            
            total = total + grossPay;
            
            System.out.printf("Pay for employee %d is $%.2f\n\n",employeeCounter,grossPay);
            
            employeeCounter = employeeCounter + 1;
        }
        System.out.printf("Grand total is $%.2f\n\n",total);
    }
}
