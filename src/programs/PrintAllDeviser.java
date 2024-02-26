package programs;

public class PrintAllDeviser {
	public static void main(String ... args){
		int n=125;
		int count =0;
		for(int i=1;i<=(int)Math.sqrt(n);i++){
			if(n%i==0){
				System.out.print(i+" ");
				count++;
				if(i != n/i) 
				{
					System.out.print(n/i + " ");
					count++;
				}
			}
			
		}
		System.out.println("count"+count);
	}
}
