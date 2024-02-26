package collectionpakage;
import java.util.*;

public class DemoStackClass {
	public static void main(String[]args){
		Stack <String> stackobj = new Stack<>();
		stackobj.push("aa");
		stackobj.push("bb");
		stackobj.push("cc");
		stackobj.push("dd");
		stackobj.push("ee");
		stackobj.pop();
		stackobj.pop();
		stackobj.push("ff");
		stackobj.push("gg");
		System.out.println(stackobj.peek());
		stackobj.push("hh");
		
		stackobj.pop();
		stackobj.pop();
		System.out.println(stackobj);
		
		
		
	}
}
