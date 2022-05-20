package RecursionOnTheWayUp;

import java.util.Scanner;

public class CountTheNumberOfSubsets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		int val=count(arr,0,arr.length,sum);
		System.out.println(val);
	}
	
	private static int count(int[] arr, int i, int n, int sum) {
		if(i==n) {
			if(sum==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		int left=0,right=0;
		// picking as sum 
		if(arr[i]<=sum) {
			sum-=arr[i];
			 left=count(arr,i,n,sum);
			sum+=arr[i];
		}
		// not picking
		  right= count(arr,i+1,n,sum);
		 return left+right;
	}

}
