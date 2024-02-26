package PredicateDemoPackage;

import java.util.function.Predicate;

public class PredicateJoiningDemo {
	public static void main(String[] args) {
		Predicate<String> checklength=s->s.length() >5;
		System.out.println(checklength.test("alok"));
		
		Predicate<String> islengthEven=s->s.length()%2==0;
		System.out.println(islengthEven.test("alok"));
		
		// and or negate
		
		System.out.println("merging with and "+ checklength.and(islengthEven).test("alok"));
		
		System.out.println("merging with or "+ checklength.or(islengthEven).test("alok"));
		
		System.out.println(islengthEven.negate().test("alok"));
		

	}
}
