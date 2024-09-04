package String;

public class stringPoolExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		// True, because str1 and str2 refer to the same object in the string pool
		System.out.println(str1 == str2);

		// False, because str3 refers to a new object created in the heap
		System.out.println(str1 == str3);

		// True, because intern() method returns the reference from the string pool
		System.out.println(str1 == str3.intern());
	}

}
