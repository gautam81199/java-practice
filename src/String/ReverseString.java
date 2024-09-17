package String;

public class ReverseString {
	public static void main(String args) {
		String original = "Welcome to the company";
		String reversed = "";
		for (int i = original.length()-1; i >= 0; i--) {
			reversed += original.charAt(i);
		}
		System.out.println("Reverse String:" +reversed);

	}

}
