/*
5.24: Prints asterisks into a diamond shape
Peter Phan 9/23/14
 */


import java.util.Scanner;

public class Diamond {
   
    public static void main (String[] args)
    {
       Scanner input = new Scanner( System.in );
       
       int maxNum;
    
       System.out.print("Enter max number of stars (odd number): ");
       maxNum = input.nextInt();
       
       int numOfStars = 1;       
       int numOfSpaces = maxNum/2;
       
       
       for (int i=1; i <= maxNum; i++)
       {
           for (int j = numOfSpaces; j>=1; j--)
           {
               System.out.print(" ");
           }
           for (int k=1; k <= numOfStars; k++)
           {
               System.out.print("*");
           }
       System.out.println();
       
       if (i<maxNum/2+1)
       {
           numOfSpaces = numOfSpaces - 1;
           numOfStars = numOfStars + 2;
       }
       else
       {
           numOfSpaces = numOfSpaces + 1;
           numOfStars = numOfStars - 2;
       }
    }
}
}