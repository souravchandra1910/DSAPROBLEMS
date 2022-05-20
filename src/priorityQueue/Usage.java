package priorityQueue;
import java.util.*;


public class Usage {

	public static void main(String[] args) {
//		A priority queue is a special type of queue in which each element 
//		is associated with a priority and is served according to its priority.
//		If elements with the same priority occur, 
//		they are served according to their order in the queue.
//		In a queue, the first-in-first-out rule is implemented whereas,
//		in a priority queue, the values are removed on the basis of priority. 
//		The element with the highest priority is removed first.

		
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();// min heap
		pq.add(13);
		pq.offer(14);
		pq.add(25);
		pq.add(100);
		pq.add(78);
		pq.add(81);
		pq.add(95);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
        System.out.println(pq.remove());
    	System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
        System.out.println(pq.remove());
       
}
//        PriorityQueue<Integer>pq2=new PriorityQueue<>(Comparator.reverseOrder());//max heap
//		Queue<Integer>q=new LinkedList<>();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		
//	
//		q.add(3);
//		
//		q.add(2);
//		
//		q.add(1);
//		System.out.println(q);
		
        
        
	}


