package programs;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
	
	// bruteforce 
	public static int removeduplicates(int arr[]){
		HashSet<Integer> hs= new HashSet<>();
		for(Integer a:arr){
			hs.add(a);
		}
		int k=hs.size();
		
		Iterator<Integer> it = hs.iterator();
		int i=0;
		while(it.hasNext()){
			arr[i++]=it.next();
		}
		return k;
	}
	
	public static int RemoveDuplicatesOptimaly(int arr[]){
		int i=0;
		for(int j=1;j<arr.length;j++){
			if(arr[i]!=arr[j]){
				arr[i++]=arr[j];
			}
		}
		return i;
	}
	public static void main(String ... args){
		int arr[]={2,3,3,3,4,5,5,6,8};
		int k=removeduplicates(arr);
		for(int i=0; i< k; i++){
			System.out.print(arr[i]+" ");
		}
		int arr2[]={2,3,3,3,4,5,5,6,8};
		System.out.println();
		k = RemoveDuplicatesOptimaly(arr2);
		for(int i=0; i< k; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
