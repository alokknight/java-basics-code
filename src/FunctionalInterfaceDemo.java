@FunctionalInterface
public interface FunctionalInterfaceDemo {
	abstract void singleAbstractMethod();
	default void defaultfunction(){
		System.out.print("defaultfuction");
	}
}
