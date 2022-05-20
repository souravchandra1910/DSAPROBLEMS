package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterELementToTheRight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long []arr=new long [(int) n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();  
		}
		long []nge=nser(arr,n);
		for(long val:nge) {
			System.out.println(val);
		}
		

		}
		public static long []nser(long []arr,int n){
			long []nge=new long[n];
//			Stack<Integer>st=new Stack<>();
//			st.push( arr[n-1]);
//			nge[n-1]=-1;
//			for(int i=n-2;i>=0 ;i--) {
//				while(st.size()>0 && arr[i]>=st.peek()) {
//					st.pop();
//					
//				}
//				if(st.size()==0) {
//					nge[i]=-1;
//					
//				}
//				else {
//					nge[i]=st.peek();
//					}
//				st.push( arr[i]);
//			}
			
			  Stack<Integer>st=new Stack<>();
			  st.push(0);
			  for(int i=1;i<arr.length;i++){
			      while(st.size()>0 && arr[i]>arr[st.peek()]){
			          int pos=st.peek();
			          nge[pos]=arr[i];
			          st.pop();
			      }
			      st.push(i);
			  }
			      while(st.size()>0){
			          int pos=st.peek();
			          nge[pos]=-1;
			          st.pop();
			      }
			      
			  
			   return nge;
////			
//			return nge;

	}


	

}
