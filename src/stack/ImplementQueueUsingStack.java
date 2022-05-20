  package stack;
import java.util.*;
public class ImplementQueueUsingStack {
     static Stack<Integer>st=new Stack<>();
     static Stack<Integer>helper=new Stack<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          push(n);
          
	}
	static void push(int x) {
		// how to implement push()
		// 1st step -> Move all st elements to helper
		    while(!st.isEmpty()) {
		    	int val=st.pop();
		    	helper.push(val);
		    }
		 // 2nd step -> push in x in the st 
		 st.push(x);
		 // 3rd step -> Move all helper  elements to st
		 while(!helper.isEmpty()) {
			 int val=helper.pop();
			 st.push(val);
		 }
	}
	static int pop() {
		return st.pop();
	}
	static int top() {
		return st.peek();
	}
	static boolean empty() {
		return st.isEmpty();
	}

}
