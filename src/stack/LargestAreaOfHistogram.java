package stack;

import java.util.Scanner;

public class LargestAreaOfHistogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long []arr=new long[(int) n];
		long val= getMaxArea(arr,n);
		System.out.println(val);
			    
 
	}
	 public static long getMaxArea(long arr[], long n) 
	    {
		 long max=Integer.MIN_VALUE;
	       for(int i=0;i<n;i++){
	           int left=i;
	           int right=i;
	           while(right<arr.length && arr[right]>=arr[i]) {
	        	   right++;
	           }
	           while(left>=0 && arr[left]>=arr[i]) {
	        	   left--;
	           }
	          long area=(right-left-1)*arr[i];
	           max=Math.max(max,area);
	           
	           
	       }
	       return max;
	       
	    }

}
