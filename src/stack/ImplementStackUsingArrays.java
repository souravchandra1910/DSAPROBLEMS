package stack;

import java.util.Scanner;

public class ImplementStackUsingArrays {

	  static int []stack=new int[5];
	  static int top=-1;
	
	public static void main(String[] args)throws Exception {
    Scanner sc=new Scanner(System.in);
   
    
    
    while(true)
    {
	       System.out.println(" enter operation :\n press 1 for push\n press 2 for pop\n press 3 for peek\n press 4 for display\n press 5 for exit\n ");
	       int operation1=sc.nextInt();
	        switch (operation1)
          {
          case 1:
        	  System.out.println("Enter the data to be inserted");
        	  int x=sc.nextInt();
              push(x);
          
            break;
        case 2:
        	      int val=pop();
        	     System.out.println(val);
                    break;
        case 3:
	        	int val1=peek();
	        	System.out.println(val1);
	        	break;
        case 4:
                  display();
                   break; 
        case 5:
        	System.exit(0);
        default:
                    break;
        }
    } 

}
	
	 static void push(int x)throws Exception {
		if(top==stack.length-1) {
			throw new Exception("Stack is Full");
		
		}
		else {
			stack[++top]=x;
		}
	}
	 static int pop()throws Exception {
		if(top==-1) {
			throw new Exception("Stack is Empty");
		}
		else {
			int val=stack[top];
			top--;
			return val;
		}
		
	}
	 public static int peek() throws Exception {
		 if(top==-1) {
			 throw new Exception("Stack is Empty");
		 }
		 else {
			 int val=stack[top];
			 return val;
		 }
	 }
	 public static void display () throws Exception {
		 if(top==-1) {
			 throw new Exception("Stack is Empty");
		 }else {
			 for(int i=top;i>=0;i--) {
				 System.out.println(stack[i]);
			 }
		 }
		 
	 }
	 

}
