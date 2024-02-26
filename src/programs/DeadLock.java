package programs;

public class DeadLock {
	public void method1(){
		synchronized (Integer.class){
			System.out.println("integer method 1");
		}
		synchronized (String.class){
			System.out.println("String class of method 1");
		}
	}
	public void method2(){
		synchronized (String.class){
			System.out.println("String class of method 2");
		}
		synchronized (Integer.class){
			System.out.println("integer method 2");
		}
	}
	
	public static void main(String ... args){
		DeadLock d = new DeadLock();
		d.method1();
		d.method2();
	}
}
