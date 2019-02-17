/*
6.20: Calculate area of a circle
Peter Phan 10/1/2014
 */

import java.util.Scanner;

public class CircleTe {

    public static void main (String[] args) 
   {
      Scanner input = new Scanner( System.in );
      int counter = 0;
      int radius = 0;

      while (radius != -1)
      {
        System.out.print( "Enter the radius (negative to quit): " );
        radius = input.nextInt();
      
        double result = calcArea(radius);
        
        if (radius > 0)
            System.out.println( "Area is " + result);
            System.out.println();
      }
   }

   public static double calcArea( int x )
   {
      double area;
      
      area = Math.PI * Math.pow(x, 2);

      return area;
   }
}
