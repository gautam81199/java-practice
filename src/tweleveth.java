/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

import java.util.Scanner;

public class tweleveth {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the three number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		long d= (a+b+c)/2;
		System.out.println("Average"+d);
	}

}
