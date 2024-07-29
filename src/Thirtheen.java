/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5*/

import java.util.Scanner;

public class Thirtheen {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("input breadth and height");
		int breadth = sc.nextInt();
		int height =  sc.nextInt();
		int area = breadth*height;
		int perimeter = 2*breadth*2*height;
		System.out.println("area:" +area);
		System.out.println("perimeter:"+perimeter);
		
		
	}

}
