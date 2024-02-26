package besic;

public class basic {
	public static void main(  String args []){
		String s1="alok";
		String s2 = "patel";
		for(int i=0;i<s1.length();i++){
			System.out.print(s1.charAt(i));
		}
		int i=0;
		int j=s1.length()-1;
		while(i<j){
			char c=s1.charAt(i);
			
			
			i++;j--;
		}
	}
}
