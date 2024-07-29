/*Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT*/

import java.util.Scanner;

public class thirty_seven {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");
		String a = sc.nextLine();
//		char[] letters = a.toCharArray();

		for(int i= a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	

}
