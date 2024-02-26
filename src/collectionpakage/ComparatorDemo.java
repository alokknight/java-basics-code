package collectionpakage;

import java.util.*;

class Emp{
	 String name;
	 int age;
	Emp(int age, String name){
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
} 


public class ComparatorDemo {

	public static void main(String agrs []){

		List<Emp>  l= new ArrayList<>();

		l.add(new Emp(19,"alok") );
		l.add(new Emp(20,"aman") );
		l.add(new Emp(21,"vidhan")  );
		l.add(new Emp(18,"ujjwal" ));
		l.add(new Emp(17,"vanu") );
		l.add(new Emp(19,"katiya"));
		l.add(new Emp(18,"alok") );
		
		
		Collections.sort(l, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()) );

//		l.stream().forEach(System.out::println);
		l.stream().forEach(s->{System.out.println(s.age+" "+s.name);});
	
	
}
}
