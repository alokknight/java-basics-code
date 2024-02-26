package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int arr[]){
		int n = arr.length;
		for (int i=0;  i< n-1; i++ ){
			boolean swap = false;
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]	 = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}
				if(swap==false){
					break;
				}
			}
		}
		
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	public static void main(String args []){
		
	      Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        bubbleSort(arr);

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        scan.close();
	    }
		

}
