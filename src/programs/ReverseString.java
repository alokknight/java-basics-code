package programs;

public class ReverseString {

public static void reverseStr(String s){
	StringBuilder sb = new StringBuilder(s);
	
	for(int i = 0 ; i< sb.length()/2;i++){
		char w1=sb.charAt(i);
		char w2=sb.charAt(sb.length()-i-1);
		sb.setCharAt(i, w2);
		sb.setCharAt(sb.length()-1-i, w1);
	}
	String s2=sb.toString();
	System.out.println(s2);
	
//	0123456
//	len = 7
//	i=0 j=7-0-1=6
//	i=1 j=7-1-1=5
}
public static void main(String[] args) {
	String s= "alok patel";
	reverseStr(s);
}
}
