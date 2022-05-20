package queue;
import java.util.*;
public class Pq_1 {

	public static void main(String[] args) {
	PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(50);
		pq.add(40);

		
		System.out.println(pq);
		
		
	System.out.println(pq.remove());
	
	System.out.println(pq.remove());
	
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	System.out.println(pq.remove());
	
	}
	

}
