package Polymorphism;

class MathOperations {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(MathOperations.add(2, 3));
		System.out.println(MathOperations.add(2, 3, 8));
		System.out.println(MathOperations.add(2.5, 3.3));

	}

}
