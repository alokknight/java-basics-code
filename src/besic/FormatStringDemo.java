package besic;

public class FormatStringDemo {
	public static void main(String args[]){
		double dblTotal= 23232321.5343;
		int intValue = 32323;
		String stringVal = "alokp paere";
		System.out.printf("Total is: $%,.2f%n", dblTotal);
		System.out.printf("Total: %-10.2f: ", dblTotal);
		System.out.printf("% 4d", intValue);
		System.out.printf("%20.10s\n", stringVal);
		String s = "Hello World";
		System.out.printf("The String object %s is at hash code %h%n", s, s);
	}
}
