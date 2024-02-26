package streamDemoPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamClass {
	public static void main(String[] args) {
		List<Integer> arraylist1=new ArrayList<Integer> ();
		arraylist1.add(4);
		arraylist1.add(6);
		arraylist1.add(5);
		arraylist1.add(8);
		
		
		List<Integer> newArrayList1=new ArrayList<Integer> ();
		
		newArrayList1 = arraylist1.stream().filter(i-> i>4).collect(Collectors.toList());		
		newArrayList1.stream().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		arraylist1.stream().map(i-> i*i).forEach(x->System.out.print(x+" "));
	}
}
