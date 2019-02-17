/*
5.16: Writes number of 5 inputs and displays stars/asterisks for them
Peter Phan 9/23/14
 */

import java.util.Scanner;

public class BarChart {
   
    public static void main (String[] args){
    
        Scanner input = new Scanner( System.in );
        
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int line = 1;

        System.out.print("Enter a number from 1-30: ");
        n1 = input.nextInt();

        System.out.print("Enter a number from 1-30: ");
        n2 = input.nextInt();
        
        System.out.print("Enter a number from 1-30: ");
        n3 = input.nextInt();
        
        System.out.print("Enter a number from 1-30: ");
        n4 = input.nextInt();
        
        System.out.print("Enter a number from 1-30: ");
        n5 = input.nextInt();


        System.out.println();
        for (int i=1; i<=n1;i++)
        {
            System.out.print("*");

        }
            System.out.println();
            
        for (int i=1; i<=n2;i++)
        {
            System.out.print("*");
        }
            System.out.println();
        for (int i=1; i<=n3;i++)
        {
            System.out.print("*");
        }
            System.out.println();
            
        for (int i=1; i<=n4;i++)
        {
            System.out.print("*");
        }
            System.out.println();
            
        for (int i=1; i<=n5;i++)
        {
            System.out.print("*");
        }
    }     
}
    

    
