		package stack;
		import java.util.Scanner;
		import java.util.Stack;
		// amortised method 
	public class StackToQueue {
	           static Stack<Integer>input=new Stack<>();
		     static Stack<Integer>output=new Stack<>();
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
		          int n=sc.nextInt();
		          push(n);
		          
			}
			static void push(int x) {
				input.push(x);
			}
			static int pop() {
				if(output.isEmpty()==false) {
					return output.pop();
				}
				while(!input.isEmpty()) {
					int val=input.pop();
					output.add(val);
				}
				return output.pop();
			}
			static int top() {
				if(output.isEmpty()==false) {
					return output.peek();
				}
				while(!input.isEmpty()) {
					int val=input.pop();
					output.add(val);
				}
				return output.peek();
			}
			static boolean empty() {
				return output.isEmpty() && input.isEmpty();
			} 

		}
