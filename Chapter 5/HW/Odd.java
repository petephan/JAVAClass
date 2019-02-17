/*
5.12: Calculates the total of all odd numbers from 1 to 15
Peter Phan 9/23/14
 */


public class Odd {
   
    public static void main (String[] args)
    {
        int total = 1;
       
        for (int number = 1; number <=15; number +=2)
            total *= number;
       
        System.out.printf("Product is %d\n", total);
    }
}