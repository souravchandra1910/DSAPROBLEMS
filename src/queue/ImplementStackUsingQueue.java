package queue;
// using two Queues
import java.util.*;

public class ImplementStackUsingQueue {

	 static Queue<Integer>q1=new LinkedList<>();
	 static Queue<Integer>q2=new LinkedList<>();		 ;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		push(n);
		int a=pop();
		System.out.println(a);
		int b=top();
		System.out.println(b);
		boolean val=isEmpty();
		System.out.println(val);
	}
	static void push(int x) {
		// how to implement push?
		// 1st step add the value to queue2
		q2.add(x);
		// 2nd step add all elements from q2 to q1
		while(!q1.isEmpty()) {
			int s=q1.remove();
			q2.add(s);
			
		}
		// 3rd step swap q1 and q2
		Queue<Integer>temp=new LinkedList<>();
		temp=q1;
		q1=q2;
		q2=temp;
		
		
	}
	static int pop() {
		return q1.remove();
		
	}
	static int top() {
		return q1.peek();
		
	}

	static boolean isEmpty() {
		return q1.isEmpty();
		
	}
	
	
}
