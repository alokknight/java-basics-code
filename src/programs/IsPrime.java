package programs;

public class IsPrime {
	public static void main(String[] args) {
		int x=61;
		boolean flag=false;
		for(int i=2;i<x/2;i++){
			if(x%i==0){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("not prime");
		}else{
			System.out.println("prime");
		}
	}
}
