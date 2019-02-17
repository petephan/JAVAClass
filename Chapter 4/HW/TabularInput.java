/*
4.22 Tabular Input
Peter Phan 9/21/14
*/

import java.util.Scanner;

public class TabularInput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		
        int counter = 1;
        int n;
        int n10;
        int n100;
        int n1000;

        System.out.println("N   10*N  100*N  1000*N\n");
        
        while (counter <= 5)
        {
            n = counter;
            n10 = n * 10;
            n100 = n * 100;
            n1000 = n * 1000;
            
            System.out.printf("%d   %d    %d    %d\n", n, n10, n100, n1000);
            
        counter = counter + 1;
        }   
    }
}
