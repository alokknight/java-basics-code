package programs;

public class ArmStrong {
	public static void armstrongByStringCon(){
		int num=1634;
		
		// get length of number by converting into string 
        String numberString = String.valueOf(num);
        int length = numberString.length();
        
        char[] chararray=numberString.toCharArray();
        int len = chararray.length;
        int  sum =0;
        for(int i = 0 ; i< len; i++){
        	sum +=Math.pow(Character.getNumericValue(chararray[i]), len);
        			
        }
        System.out.println(sum);
	}
	public static void main(String ... args ){
		int num=1634;
		
        
        // get length of number
        int temp=num;
        int len=0;
        while(temp!=0){
        	temp=temp/10;
        	len++;
        }
        
        
        int result=0;
        while(num!=0)    // while(num!=0)
        {
        	int lastdigit=num%10;
        	result+=Math.pow(lastdigit,len);
        	num/=10;
        }
        System.out.println(result);
	}
}
