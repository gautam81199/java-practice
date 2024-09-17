package Araays;

import java.lang.reflect.Array;

public class CommonNumber {
	public static void main(String[] args) {
		int array1[] = { 20, 30, 40, 50, 60 };
		int array2[] = { 25, 30, 45, 40, 50 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);
					break;
				}
			}

		}
	}
}
