
public class DimondProblemClass implements DiamondProblemInterface1 , DiamondProblemInterface2 {

	@Override
	public void fun() {
		DiamondProblemInterface2.super.fun();
	}
	
//	public void fun() {
//		DiamondProblemInterface1.super.fun();
//	}  
	
	
	public static void main(String args[]){
		DimondProblemClass dimondProblemClassobj = new DimondProblemClass();
		dimondProblemClassobj.fun();
		
	}

}
