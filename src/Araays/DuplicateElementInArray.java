package Araays;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int array[] = { 10, 5, 100, 10, 34, 24, 90, 24, 70, 100 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate element found:" + array[i]);

				}

			}
		}
	}
}
