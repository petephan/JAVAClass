/*
 * 8.4: Calculate Perimeter and Area of Rectangle
 * Peter Phan 10/25/14
 */
package Chapter8;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle length1 = new Rectangle();
        Rectangle width1 = new Rectangle();

        double length;
        double width;
        int option;

        System.out.println("1. Set Length");
        System.out.println("2. Set Width");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
        option = input.nextInt();

        if (option == 3) {
            System.exit(0);
        }

        if (option == 1) {
            System.out.print("\nEnter Length: ");
            length = input.nextDouble();
            length1.setLength(length);
        }

        if (option == 2) {
            System.out.print("\nEnter Width: ");
            width = input.nextDouble();
            width1.setWidth(width);
            System.out.print(width1.toString());
        }
    }
}
