package Operators;

public class AssignmentOperator {
	
	public static void main(String[] args) {
        int a = 10;
        int b;
        b = a; // Assignment
        System.out.println("b = " + b);
        b += a; // Addition assignment
        System.out.println("b += a: " + b);
        b *= a; // Multiplication assignment
        System.out.println("b *= a: " + b);
    }

}
