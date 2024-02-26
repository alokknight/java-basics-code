import java.util.*;
import java.io.*;
public class SecndClass {
	private int i=0;
	public static void fun(){
		int arr[]= new int[]{1,2,3,4,5};
		
		Vector<Integer> vec = new Vector();
		Hashtable<Integer , String > has = new Hashtable();
		vec.add(12);
		vec.add(232);
		vec.add(3,34);
		has.put(1,"alok");
		has.put(2, "patel");
		System.out.println("alok patel");
		System.out.println(arr[2]);
		System.out.println(vec.elementAt(1));
		System.out.println(has.get(2));
		
//		alt + shift + Z = for try-catch / do while block
//		alt + shift + S R = for getter and setter
//		alt + shift + S O = for constructor
//		clt + shift + O = for import
//		clt + shift + / = for multiline comments
		
	}

}
