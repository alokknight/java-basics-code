package PredicateDemoPackage;
import java.util.function.*;

public class BiPredicateBiFunctionDemo {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> isMoreThan6 = (a,b)-> a+b>6;
		
		BiFunction<Integer,Integer,Integer> multipyBoth= (a,b)-> a*b;
 
		System.out.println( isMoreThan6.test(3,5));
		System.out.println( multipyBoth.apply(3,5));
	}
}
