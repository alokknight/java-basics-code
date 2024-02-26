package programs;

public class FindOccurence {
	static int first = -1;
	static int last = -1;
	public static int FindOccurence(String str, char c){
		for(int indx=0; indx<str.length();indx++){
			if(first==-1){
				first = indx;
			}
			else last=indx;
		}
		
		return FindOccurence();
	}
	public static void main(String[] args) {
		
	}
}
