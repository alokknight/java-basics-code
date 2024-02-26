package programs;

public class sumOfDigits {
	public static void main(String[] args) {
		
		int a = 993;
		int sum=0;
		while(a>1){
			int r=a%10;
			sum+=r;
			a/=10;
		}
		System.out.println(sum);
	}
}
