package PredicateDemoPackage;
import java.util.function.*;


public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> squareMe = i->i*i;
		squareMe.apply(6);
		

	}
}
