package PredicateDemoPackage;

import java.util.function.Function;

public class FunctionalChainingDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> doubleMe= i->2*i;
		Function<Integer,Integer> squareMe= i->i*i;
		
		
		// 1st.andThen(2nd)   2*3->6 6*6->36
		System.out.println(doubleMe.andThen(squareMe).apply(3));
		
		// 2nd.compose(1st)   3*3->9 2*9->18
		
		System.out.println(doubleMe.compose(squareMe).apply(3));
		
		
		
	}
}
