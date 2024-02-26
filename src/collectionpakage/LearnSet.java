package collectionpakage;
import java.util.*;
public class LearnSet {
	public static void main(String [] args){
		
		Set<Student> studentset = new HashSet<>();
		studentset.add(new Student("alok",2));
		studentset.add(new Student("patel",3));
		studentset.add(new Student("varun",4));
		studentset.add(new Student("abhinav",4));
		studentset.add(new Student("varun",5));
		
		
		Student s1 = new Student("varun",4);
		Student s2 =  new Student("varun",4);
		System.out.println(s1.equals(s2));
		System.out.println(studentset);
		
	}
}
