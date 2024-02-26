package programs;

public class AddMatrixes {
	
	public static int[][] addmatrixes(int matrixA[][], int matrixB[][]){
		

		int [][] matrixC= new int [3][4];
		
		for(int i=0; i< 3;i++){
			for(int j=0; j<4;j++){
				matrixC[i][j]= matrixA[i][j]+matrixB[i][j];
			}
		}
		return matrixC;
		
	}
	
	
	public static void printM(int[][] arr){
		int m=arr.length;
		int n=arr[0].length;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int [][] matrixA  = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] matrixB = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		printM(addmatrixes(matrixA,matrixB));
	}
}
