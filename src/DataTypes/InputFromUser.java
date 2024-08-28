package DataTypes;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accepting two integers from the user
		System.out.print("Enter the first integer: ");
		int firstInt = scanner.nextInt();
		System.out.print("Enter the second integer: ");
		int secondInt = scanner.nextInt();

		// Calculating the required values
		int sum = firstInt + secondInt;
		int difference = firstInt - secondInt;
		int product = firstInt * secondInt;
		double average = (double) (firstInt + secondInt) / 2;
		int distance = Math.abs(firstInt - secondInt);
		int max = Math.max(firstInt, secondInt);
		int min = Math.min(firstInt, secondInt);

		// Printing the results
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Average: " + average);
		System.out.println("Distance: " + distance);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
