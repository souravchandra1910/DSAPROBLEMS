package hashMapAndHeap;

import java.util.Scanner;

//Given an array of positive integers nums and a positive integer target,
//return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
//of which the sum is greater than or equal to target. If there is no such subarray,
//return 0 instead.
public class MinimumSizeSubArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int val=minSubArrayLen(target,arr);
		System.out.println(val);
	   
	}
	 public static int minSubArrayLen(int target, int[] arr) {
         int sum=0;
		 int min=0;
		 int i=-1,j=-1;
		 while(true) {
			boolean f1=false;
			boolean f2=false;
			while(i<arr.length-1 && sum < target) {
				i++;
				f1=true;
				sum+=arr[i];
			}
			
			while(j < i && sum>=target) {
				int len=i-j;
				f2=false;
				if(min==0 || len < min) {
					min=len;
				}
				j++;
				sum-=arr[j];
			}
			if(f1==false && f2==false) {
				break;
			}
		 }
		 return min;
   }
}
