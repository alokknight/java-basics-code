import java.util.Comparator;
import java.util.function.*;

public class LambdaDemo {
 public static void main( String args[]){
	 
//	 (a,b)->System.out.println(a+b);
	 LambdaDemo lb= new LambdaDemo();
	 lb.sum(3,4);
	 
	 
	 BiConsumer<Integer, Integer> biconsumer = (a,b)->System.out.println(a+b);
	 biconsumer.accept(3,6);
//	 lb.sum(2,4);
 }
 public int sum(int a, int b){
	 int s=a+b;
	 System.out.println(a+b);
	 return s;
 }
}
