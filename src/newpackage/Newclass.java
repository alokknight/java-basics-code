package newpackage;
import java.util.*;
import java.util.Collections;
public class Newclass {
	public static void main(String[] args)throws UnsupportedOperationException{
		try{
			List<String > list1 = new ArrayList<>();
			list1.add("alok");
			list1.add("patel");
			list1.add("cse");
			List< String> unmodifable = Collections.unmodifiableList(list1);
			unmodifable.add("alok");
			System.out.println(unmodifable);
					
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("error catched");
		}
		finally{
			System.out.println("finally");
		}
	}
}
