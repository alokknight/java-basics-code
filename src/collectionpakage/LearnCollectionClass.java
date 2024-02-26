package collectionpakage;
import java.util.*;

public class LearnCollectionClass {
	 public static void main(String [] args){
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("alok",2));
		studentlist.add(new Student("patel",3));
		studentlist.add(new Student("varun",4));
		studentlist.add(new Student("abhinav",4));
		studentlist.add(new Student("varun",5));
		
		
		Student s1 = new Student("varun",4);
		Student s2 =  new Student("varun",4);
		Student s3 =  new Student("tanu",3);
		
		Collections.sort(studentlist);
		
		System.out.println(studentlist);
		
		Collections.sort(studentlist, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		Collections.sort(studentlist, (o1,o2)->o1.name.compareTo(o2.name));
		
		System.out.println(studentlist);
		/// this.compareTo(that) if returned value is positive then current value is larger. 
		/// means this.obj > that.obj
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(studentlist);
		
		
		/////////////////////////////////////
		//////////////////////////////////////
		
		 List<Integer> list = new ArrayList<>();
		 list.add(1);
		 list.add(3);
		 list.add(4);
		 list.add(5);
		 list.add(6);
		 list.add(7);
		 list.add(4);
		 
		 Collections.sort(list,Comparator.reverseOrder());
		 System.out.println(list);
		 
	 }
}
