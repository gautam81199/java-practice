package Interview_question;

public class reverse_string_in_Java {
	public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }

}
