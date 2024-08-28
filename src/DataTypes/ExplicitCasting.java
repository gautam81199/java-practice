package DataTypes;

public class ExplicitCasting {

	public static void main(String[] args) {
		double a = 9.78;
		System.out.println("double value: " + a);

		int b = (int) a; // Explicit type casting from double to int
		System.out.println("int value: " + b);

		float c = (float) a; // Explicit type casting from double to float
		System.out.println("float value: " + c);

		long d = (long) a; // Explicit type casting from double to long
		System.out.println("long value: " + d);

		short e = (short) b; // Explicit type casting from int to short
		System.out.println("short value: " + e);

		byte f = (byte) e; // Explicit type casting from short to byte
		System.out.println("byte value: " + f);
	}
}
