/*Write a program to find the largest number in an array in Java.*/
package Interview_question;

public class largest_number_in_an_array {
	public static void main(String[]args) {
		int[] nums = {1, 5, 3, 9, 7};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Largest number: " + max);
	}

}
