package PredicateDemoPackage;
import java.util.function.*;
public class CosumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> sqareMe= i-> System.out.println("by consumer squareMe"+ i*i);
		
		sqareMe.accept(4);
	}

}
