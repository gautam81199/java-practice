package DataTypes;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		byte p = 12;
		System.out.println("byte value: " + p);

		short q = p; // Implicit type casting from byte to short
		System.out.println("short value: " + q);

		int r = q; // Implicit type casting from short to int
		System.out.println("int value: " + r);

		long s = r; // Implicit type casting from int to long
		System.out.println("long value: " + s);

		float t = s; // Implicit type casting from long to float
		System.out.println("float value: " + t);

		double u = t; // Implicit type casting from float to double
		System.out.println("double value: " + u);
	}
}
