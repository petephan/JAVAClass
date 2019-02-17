/*
4.21 Find Largest Number
Peter Phan 9/21/14
*/

import java.util.Scanner;

public class LargestNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		
        int counter = 1;
        int number;
        int largest = 0;

        System.out.print("Enter number: "); //prompt
        largest=input.nextInt(); //read number from user
        
        while (counter <= 9)
        {
            System.out.print("Enter number: "); //prompt
            number=input.nextInt(); //read number from user
                        
            if (number > largest)
                largest = number;

        counter = counter + 1;
        }
        System.out.printf("Largest number is %d\n\n",largest);
    }
}
