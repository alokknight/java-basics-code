package programs;

public class GCD {
	public static int  gcd(int a, int b){
		if(b==0){
			return a; 
		}
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		int g=gcd(10,15);
		System.out.println(g);
	}
}
