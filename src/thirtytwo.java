/*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/

import java.util.Scanner;

public class thirtytwo {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input");
			int number1= sc.nextInt();
			int number2= sc.nextInt();
			 if (number1 == number2)
		            System.out.printf("%d == %d\n", number1, number2);
		        if (number1 != number2)
		            System.out.printf("%d != %d\n", number1, number2);
		        if (number1 < number2)
		            System.out.printf("%d < %d\n", number1, number2);
		        if (number1 > number2)
		            System.out.printf("%d > %d\n", number1, number2);
		        if (number1 <= number2)
		            System.out.printf("%d <= %d\n", number1, number2);
		        if (number1 >= number2)
		            System.out.printf("%d >= %d\n", number1, number2);
			
			
			
		}
		
	}


