package programs;

import java.util.ArrayList;

public class Kadane {
	public static int findMaxSum(ArrayList<Integer> ar){
		int globalMax =ar.get(0);
		int currentMax=ar.get(0);
		for(int i =1 ;i< ar.size();i++){
			currentMax=Math.max(ar.get(i), currentMax+ar.get(i));
			globalMax =Math.max(globalMax, currentMax);
		}
		return globalMax;
	}
	public static void main(String args []){
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(-1);
		ar.add(2);
		ar.add(-3);
		ar.add(-2);
		ar.add(3);
		ar.add(-1);
		ar.add(2);
		int r=findMaxSum(ar);
		System.out.println(r);
	}
}
