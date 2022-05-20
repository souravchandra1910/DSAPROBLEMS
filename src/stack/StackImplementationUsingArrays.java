package stack;

public class StackImplementationUsingArrays {
	public static class MyStack{
		int top;
		int capacity;
		int[]arr;
		public MyStack(int capacity) {
		  this.capacity=capacity;
		  top=-1;
		  arr=new int[capacity];
		}
	    void push(int x) throws Exception{
		if(top==capacity-1) {
			throw new Exception("Stack is Full");
			
		}else {
			top++;
			arr[top]=x;
		}
	}
	    int pop()  throws Exception {
	    	if(top==-1) {
	    		throw new Exception("Stack is Empty");
	    		
	    	}
	    	else {
	    		int e=arr[top--];
	    		return e;
	    	}
	    }
	    boolean isEmpty() {
	    	return top==-1;
	    }
	    int peek()  throws Exception{
	    	if(top==-1) {
	    		throw new Exception("Stack is Empty");
	    	
	    	}
	    	else {
	    		int e=arr[top];
	    		return e;
	    	}
	    }
		
	}

	public static void main(String[] args) throws Exception {
		MyStack st=new MyStack(3);
		st.push(10);
		st.push(20);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		

	}

}
