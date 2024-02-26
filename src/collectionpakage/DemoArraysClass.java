package collectionpakage;
import java.util.*;
public class DemoArraysClass {
	public static void main(String []args){
		int array[]= {1,2,3,4,4,5,6,7,7,8,9,10};
		int index = Arrays.binarySearch(array, 4);
		System.out.println("The index value of element 4 in the array is: " + index);
		Integer [] numbers = {34,4,5,7,5,45,36,74,67,47,88};
		Arrays.sort(numbers);
		
		for(Integer num: numbers){
			System.out.print(num +" ");
		}
		
		Arrays.fill(numbers, 12);
		for(Integer num: numbers){
			System.out.print(num +" ");
		}
	}
}
