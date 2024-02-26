package collectionpakage;
import java.util.*;

public class DemoLinkedListClass {
	public static void main(String [] args){
		//// <-- front---------rear  <---
		/// offer()---add()
		/// poll() ---remove()
		/// peek() ---element()
		
		Queue <Integer> queueobj = new LinkedList<>();
		queueobj.offer(12);
		queueobj.offer(23);
		queueobj.offer(343);
		
		queueobj.add(343); // throws exception if task is unsuccessful
		System.out.println(queueobj);
		
		
		System.out.println(queueobj.poll());  // returns and remove head of the queue. returns null if queue empty.
		System.out.println(queueobj.remove());//throws exception if empty
		
		
		System.out.println(queueobj);
		
		System.out.println(queueobj.peek());   // returns head of the queue. returns null if empty.
		System.out.println(queueobj.element());// throws exception
		
		System.out.println(queueobj);
		
		/////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		
		
		List<String > listobj = new LinkedList<>();

		System.out.println(listobj);
		listobj.remove("alok");
		System.out.println(listobj);
		
		listobj.remove(String.valueOf("alok"));
		System.out.println(listobj);
		
		listobj.set(2, "setValue");
		
		System.out.println(listobj.contains("xyz"));
		
		

		for(int i=0; i<listobj.size(); i++){
			System.out.print(listobj.get(i) +" ");
			
		}
		
		for(String s : listobj){
			System.out.print("using for each loop: "+s + " ");
		}
		System.out.println();
		
		listobj.clear();
		System.out.println(listobj);
	}
}
