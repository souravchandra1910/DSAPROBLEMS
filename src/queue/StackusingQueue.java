package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackusingQueue {
    
	/// Using Only One Queue

	 static Queue<Integer>q1=new LinkedList<>();
			 
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
	//     3 2 1
	static void push(int x) {
		q1.add(x);
		for(int i=1;i<q1.size();i++) {
			int val=q1.remove();
			q1.add(val);
		}
		
		
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
