package programs;

import java.util.Collections;

public class SecondLargest {
	public static int secondLargest(int[]arr){
		int secondlargest=Integer.MIN_VALUE;
		int largest=Integer.MIN_VALUE;
//		
//		 if arr[i] is greater than largest then update secondlargest as largest
//		 and largest to arr[i]
//		 else if arr[i] is only greater than secondlargest and not equal to largest
//		then update secondlargest to arr[i]
//		
		for(int i=0 ;i< arr.length;i++){
			if(arr[i]>largest){
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondlargest && arr[i]!=largest){
				secondlargest=arr[i];
			}
		}
		return secondlargest;
	}
	public static void main(String[] args) {
		int arr[]={1,4,3,5,3,3,6,4,7};
		int result=secondLargest(arr);
		System.out.println(result);

	}
}
