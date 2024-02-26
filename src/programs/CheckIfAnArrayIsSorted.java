package programs;

public class CheckIfAnArrayIsSorted {
	
	public boolean checkIfArraySorted(int arr[]){
		for(int i =0 ; i< arr.length-1;i++){
			if(arr[i]>arr[i+1] && arr[i]!=arr[i+1]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		CheckIfAnArrayIsSorted obj = new CheckIfAnArrayIsSorted();
		int arr[]={1,2,3,4,5,6};
		System.out.println(obj.checkIfArraySorted(arr));
		
		
	}
}
