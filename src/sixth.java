/*rite a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24*/

import java.util.Scanner;

public class sixth {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first input");
		int x = sc.nextInt(); 
		System.out.println("second input");
		int y = sc.nextInt(); 
		System.out.println("Sum "+(x+y));
		System.out.println("Subtraction "+(x-y));
		System.out.println("Multiplication "+(x*y));
		System.out.println("Divide "+(x/y));
		System.out.println("Modulus "+(x%y));
		
	}

}
