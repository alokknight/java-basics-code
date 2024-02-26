package newpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public boolean isNumber(String input){
		String regex="\\d+";
		return Pattern.matches(regex, input);
	}
	public static boolean passwordValidator(String input){
		String regex = "^()()()[]$";
		return Pattern.matches(regex,input);

	}
	public static void main(String[] args) {
		RegexDemo r= new RegexDemo();
		String i1 = "3434";
		System.out.println(r.isNumber(i1));
		
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Visit W3Schools!");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    
	}
	
}


