/*Write a Java program to swap two variables.*/
public class fifteen {
	public static void main(String[]args) {
		int a, b, temp;
		 a = 5;
		 b= 6;
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swapping : a, b = " + a + ", " + b);
		 
		    a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("After swapping : a, b = " + a + ", " + b);
	}

}
