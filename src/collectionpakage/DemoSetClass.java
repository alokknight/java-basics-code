package collectionpakage;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class DemoSetClass {
	public static void main(String [] args){
		Set<Integer> setobj = new HashSet<>();
		setobj.add(2);
		setobj.add(34);
		setobj.add(43);
		setobj.add(56);
		setobj.add(43);
		setobj.add(43);
		setobj.add(43);
		
		System.out.println(setobj);
		
		setobj.remove(43);
		System.out.println(setobj);
		
		System.out.println(setobj.contains(43));
		
		System.out.println(setobj.contains(2));
		System.out.println(setobj.isEmpty());
		System.out.println(setobj.size());
		
		setobj.clear();
		System.out.println(setobj);
		
		
		
		////////////////////////// O(1);
		////////////////////////////
		Set<Integer> linkedHashsetobj = new LinkedHashSet<>();
		linkedHashsetobj.add(2);
		linkedHashsetobj.add(34);
		linkedHashsetobj.add(43);
		linkedHashsetobj.add(56);
		linkedHashsetobj.add(43);
		linkedHashsetobj.add(43);
		linkedHashsetobj.add(43);
		
		System.out.println(linkedHashsetobj);
		
		linkedHashsetobj.remove(43);
		System.out.println(linkedHashsetobj);
		
		System.out.println(linkedHashsetobj.contains(43));
		
		System.out.println(linkedHashsetobj.contains(2));
		System.out.println(linkedHashsetobj.isEmpty());
		System.out.println(linkedHashsetobj.size());
		
		linkedHashsetobj.clear();
		System.out.println(linkedHashsetobj);
		
		
		//////////////////////////////////// O(log n)
		////////////////////////////////////
		
		Set<Integer> treesetobj = new TreeSet<>();
		treesetobj.add(2);
		treesetobj.add(34);
		treesetobj.add(43);
		treesetobj.add(56);
		treesetobj.add(43);
		treesetobj.add(43);
		treesetobj.add(43);
		
		System.out.println(treesetobj);
		
		treesetobj.remove(43);
		System.out.println(treesetobj);
		
		System.out.println(treesetobj.contains(43));
		
		System.out.println(treesetobj.contains(2));
		System.out.println(treesetobj.isEmpty());
		System.out.println(treesetobj.size());
		
		treesetobj.clear();
		System.out.println(treesetobj);
	}
}
