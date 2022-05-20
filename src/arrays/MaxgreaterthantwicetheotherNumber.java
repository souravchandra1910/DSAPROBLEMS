package arrays;

import java.util.Scanner;

public class MaxgreaterthantwicetheotherNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=maxi(arr);
		System.out.println(max);

	}
   public static int maxi(int[]arr) {
	   int idx=-1;
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<arr.length;i++) {
		   if(max<arr[i]) {
			   max=arr[i];
			   idx=i;
		   }
	   }
		   if(idx==-1)
		   return -1;
	   for(int i=0;i<arr.length;i++) {
		   if(max < 2*arr[i] && i!=idx) {
			   return -1; 
		   }
	   }
	   return idx;
   }
}
