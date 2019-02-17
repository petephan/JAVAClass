public class Exercise_2_14 {
/*
Peter Phan 8/17/2014 - Exercise 2.14: Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Write the program using the following techniques:
a) Use one System.out.println statement.
b) Use four System.out.print statements.
c) Use one System.out.printf statement.
*/
	public static void main(String[] args) {
		//Displays numbers 1-4 on the same line, separated by one space, using one System.out.println statement
		System.out.println("1 2 3 4");
		
		//Displays numbers 1-4 on the same line, separated by one space, using four System.out.print statements
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4 \n");
		
		//Displays numbers 1-4 on the same line, separated by one space, using one System.out.printf statement
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int number4 = 4;
		System.out.printf("%d %d %d %d",number1,number2,number3,number4);

	}

}
