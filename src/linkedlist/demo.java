package linkedlist;

public class demo {
      public static class Node{
    	 int data;
    	 Node next;
    	 public Node(int data) {
    		 this.data=data;
    		 next=null;
    	 }
       
      public static void display(Node head) {
    	  Node temp=head;
    	  while(temp!=null) {
    		  System.out.println(temp.data);
    		  temp=temp.next;
    	  }
     
      }
}
      public static void main(String [] args) {
    	  Node n1=new Node(10);
    	  Node n2=new Node(20);
    	  Node n3=new Node(30);
    	  Node n4=new Node(40);
    	  Node head=n1;
    	  n1.next=n2;
    	  n2.next=n3;
    	  n3.next=n4;
    	  n4.next=null;
    	  
    	  Node.display(head);
     
    	 
      }
	
	
      
}
