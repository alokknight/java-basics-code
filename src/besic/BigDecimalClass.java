package besic;

import java.math.BigDecimal;
public class BigDecimalClass {
	public static void main(String[] args) {
		double x=1.005d;
		double y= 3.555d;
		System.out.println(x+y);
		
//		BigDecimal b = new BigDecimal(1.05);
//		BigDecimal c = new BigDecimal(3.55);
//		
//		System.out.println(b.add(c));
//		System.out.println(b.multiply(c));
//		System.out.println(b.divide(c));
		
		
		BigDecimal b2 = new BigDecimal("1.05");
		BigDecimal c2 = new BigDecimal("3.55");
		
		System.out.println(b2.add(c2));
		System.out.println(b2.multiply(c2));
		System.out.println(c2.divide(b2));
	}
}
//
//public class BigDecimalExample {
//    public static void main(String[] args) {
//        // Creating BigDecimal objects
//        BigDecimal num1 = new BigDecimal("10.5");
//        BigDecimal num2 = new BigDecimal("3");
//
//        // Basic arithmetic operations
//        BigDecimal sum = num1.add(num2);
//        BigDecimal difference = num1.subtract(num2);
//        BigDecimal product = num1.multiply(num2);
//        BigDecimal quotient = num1.divide(num2);
//
//        // Displaying the results
//        System.out.println("Sum: " + sum);
//        System.out.println("Difference: " + difference);
//        System.out.println("Product: " + product);
//        System.out.println("Quotient: " + quotient);
//    }
//}
