package collectionpakage;

import java.util.*;

public class PriorityqueueClass {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(21);
		pq.offer(34);
		pq.offer(11);
		pq.offer(40);

		System.out.println(pq);
		System.out.println(pq.poll());

		System.out.println(pq);
		System.out.println(pq.peek());

		//////////////////////////////
		Queue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
		maxheap.offer(21);
		maxheap.offer(34);
		maxheap.offer(11);
		maxheap.offer(40);

		System.out.println(maxheap);
		System.out.println(maxheap.poll());

		System.out.println(maxheap);
		System.out.println(maxheap.peek());
	}
}
