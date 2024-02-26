
public class MethodReferenceDemo {
	public static void main(String args []){
		
		FunctionalInterfaceDemo functionalInterfaceDemoObj = Test :: testimplementation;
		functionalInterfaceDemoObj.singleAbstractMethod();
		
		FunctionalInterfaceDemo fid= ()->System.out.println("singleAbstractMethod");
		fid.singleAbstractMethod();
	}
}

class Test{
	public static void testimplementation(){
		System.out.println("test implementation for single abstract method");
	}
}
