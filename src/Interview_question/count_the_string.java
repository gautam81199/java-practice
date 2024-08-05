package Interview_question;

public class count_the_string {
	public static void main(String[]args) {
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);
	}

}
