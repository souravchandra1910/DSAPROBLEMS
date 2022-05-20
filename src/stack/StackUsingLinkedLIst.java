package stack;

import linkedlist.createLinkedList.Node;

public class StackUsingLinkedLIst {
      public static class Node{
    	  int data;
    	  Node next;
    	  public Node(int data) {
    		  this.data=data;
    	  } 
      }
      public static class MyStack{
    	  Node head;
    	  int size;
    	  public MyStack() {
    		  head=null;
    		  size=0;
    	  }
     void push(int x) {
    	 Node temp=new Node(x);
    	 if(head==null) {
    		 head=temp;
    	 }
    	 temp.next=head;
    	 size++;
    	 head=temp;
    
     }
    int peek() throws Exception {
    	if(head==null) {
    		throw new Exception("Stack is Empty");	
    	}
 
    	return head.data;
    }
    int pop()throws Exception {
    	if(head==null) {
    		throw new Exception("Stack is Empty");	
    	}
    	
    	Node temp=head;
    	head=head.next;
    	size--;
    	return temp.data;
    }
    boolean isEmpty() {
    	return head==null;
    }
    void display() {
    	Node temp=head;
      for(int i=0;i<size;i++) {
    	  System.out.println(temp.data);
    	  temp=temp.next;
      }
    	
    }
    	  
      }
	public static void main(String[] args) throws Exception {
		MyStack st=new MyStack();
		
	    st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		System.out.println(st.size);  
		st.display();
	}

}
