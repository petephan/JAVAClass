import java.util.Scanner;


public class Exercise_2_26 {

	/**
	 Peter 8/17/2014
	 Wire an application that reads two integers, determines whether the first is a multiple of the second and prints the result (Hint: Use the remainder operator.)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1; //first number
		int number2; //second number
		int remainder; //remainder

		System.out.print("Enter first Integer: "); //prompt
		number1=input.nextInt(); //read first number from user
		
		System.out.print("Enter second Integer: "); //prompt
		number2=input.nextInt(); //read second number from user

		remainder = number1 % number2;
		if (remainder == 0)
			System.out.printf("%d is multiple of %d",number1,number2);
		
		if (remainder > 0)
			System.out.printf("%d is NOT multiple of %d",number1,number2);
			
	}

}
