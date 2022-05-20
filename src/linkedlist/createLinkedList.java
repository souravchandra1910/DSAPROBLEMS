package linkedlist;

import java.util.Scanner;

public class createLinkedList {
    public static class Node{
    	int data;
    	Node next;
    	
    	public Node(int data,Node next){
    		this.data=data;
    		this.next=null;
    	}
    }
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Node head=null,temp=null;
		int ch=1;
	       while(ch!=0) {
	    	   System.out.println("Enter Data at Node");
		 	Node newNode=new Node(sc.nextInt(),null);
           if(head==null) {
        	   head=temp=newNode;
           }else {
        	   temp.next=newNode;
        	   temp=newNode;
           }
	       System.out.println("press 1 to continue creating Nodes \n"
	       		+ "press 0 to discontinue");
	       ch=sc.nextInt();
	       }
	       diplay(head);
	}
	private static void diplay(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}

}
