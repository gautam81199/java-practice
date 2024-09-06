package Interview_question;

//palindrome number means it remains same when its digits are reverse. eg- 121, 1331

public class palindrome {
	public static void main(String[] args) {

	    String str = "Radar", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	

}
