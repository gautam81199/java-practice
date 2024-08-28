package DataTypes;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Accepting temperature in Fahrenheit from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Printing the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius.");
    }

}
