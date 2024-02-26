package collectionpakage;

import java.util.ArrayDeque;

public class DemoDequeClass {
	public static void main(String []args){
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(34);
		adq.offerFirst(12);
		adq.offerLast(23);
		adq.offer(34);
		adq.offer(34);
		System.out.println(adq);
		System.out.println(adq.peek());// like queue
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll()); // like queue
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		System.out.println(adq);
	}
}
