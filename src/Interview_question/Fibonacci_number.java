//Fibonacci means 0,1,1,2,3,5,8,11,19

package Interview_question;

public class Fibonacci_number {
	public static void main(String[]args) {
		//initialize term
		
		int n=10;
		int firstnum=0;
		int secondnum=1;
		for(int i=1;i<=n;i++) {
			System.out.println(firstnum+"");
			int nextnum= firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
	}

}
