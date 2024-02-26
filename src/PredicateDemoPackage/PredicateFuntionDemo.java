package PredicateDemoPackage;
import java.util.function.Predicate;


public class PredicateFuntionDemo {
	public static void main(String[] args) {
		
		Predicate<String> checklength=s->s.length() >5;
		System.out.println(checklength.test("alok"));
	}
}
