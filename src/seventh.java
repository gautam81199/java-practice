/*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8*/

import java.util.Scanner;

public class seventh {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the number");
		int x = sc.nextInt();
		for(int i = 0; i<10; i++) {
			System.out.println(x+ "*" +(i+1)+ "=" +(x*(i+1)));
			
		}
	}

}
