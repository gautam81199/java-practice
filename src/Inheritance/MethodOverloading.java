package Inheritance;

class MathOperation{
	int add(int a) {
		return a+10;
	}
	int add (int a, int b) {
		return a+b;
	}
	double add (double a, double b) {
		return a+b;
	}
}

public class MethodOverloading {
	public static void main(String[]args) {
		MathOperation math = new MathOperation();
		System.out.println(math.add(5));
		System.out.println(math.add(5,10));
		System.out.println(math.add(5.5, 10.5));
		
	}

}
