package Araays;

import java.util.Arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		int[] myArray = { 10, 12, 14, 16, 18 };

		// First method : Calculate sum using Java Streams
		int sum = Arrays.stream(myArray).sum();

		// Print the sum
		System.out.println("Sum of array elements: " + sum);
		
        //Second method: Using loop
		int summ = 0;
		for (int i = 0; i< myArray.length;i++) {
			summ += myArray[i];
		}
			System.out.println("Sum of array elements usinh loop:"+summ);
		}

	}


