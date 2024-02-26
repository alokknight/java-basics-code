
public class InterfaceDemoImp2 implements InterfaceDemo{
	public static void main(String args[]){
		InterfaceDemoImp2 interfaceDemoImp2obj = new InterfaceDemoImp2();
		interfaceDemoImp2obj.printNameABS();
		interfaceDemoImp2obj.deafultfun1();
	}

	@Override
	public void printNameABS() {
		// TODO Auto-generated method stub
		System.out.println("interfaceDemoImp2obj.printNameABS()");
		
	}
}
