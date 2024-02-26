
abstract class AbstractClass {
    public abstract void abstractMethod();
}

public class AnonymousClass {
    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {
            public void abstractMethod() {
                System.out.println("Implementation of abstractMethod using AnonymousClass.");
            }
        };

        obj.abstractMethod();
    }
}