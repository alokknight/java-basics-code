
@FunctionalInterface
public interface lambdaInterface {
	public abstract int sum(int a, int b);
	
	default void fun(){
		System.out.println("fun");
	}
	default void fun2(){
		System.out.println("fun");
	}
;}
