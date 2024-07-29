/*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5*/

import java.util.Scanner;

public class fifth {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("first input");
		int num1 = sc.nextInt();
		System.out.println("Second input");
		int num2 = sc.nextInt();
		System.out.println("Product of" +num1+ "and " +num2+ "is " +num1*num2);
		
	}

}
