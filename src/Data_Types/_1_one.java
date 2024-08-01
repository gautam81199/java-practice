
/*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/
package Data_Types;

import java.util.Scanner;

public class _1_one {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a degree in Fahrenheit:");
		double fahrenheit = sc.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
		
	}
	

}
