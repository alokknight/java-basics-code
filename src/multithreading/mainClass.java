package multithreading;

import stringpackage.StringClass;

interface xyzable{
	default void fun(){
		System.out.println("xyzable interface");
	}
	void fun2();
}

public class mainClass {
	public static void main(String args[]){
	System.out.println(Thread.currentThread().getName());
	xyzable xyzable_obj = ()->{System.out.println("fun2 of xyzable interface");};
	xyzable_obj.fun2();
	xyzable_obj.fun();
	
	multi m = new multi();
	multi2 m2 = new multi2();
	Thread t1 = new Thread(m);
	Thread t2 = new Thread(m2);
	t1.start();
	t2.start();
	StringClass stringclassobj = new StringClass();
	stringclassobj.stringDemoFun();
	
	}
	xyzable xyzable_obj2  =()->{System.out.println("functional interface");};
	
}
