package programs;

public class Factorial {
	public static int fact(int n){
		int r=1;
		for(int i=1; i<=n ;i++){
			r*=i;
		}
		return r;
	}
	
	public static int factRecursive(int n){
		if(n==1)return 1;
		return n*factRecursive(n-1);
	}
	
	public static void main(String[] args) {
		int r= factRecursive(5);
		System.out.println(r);
	}
}
