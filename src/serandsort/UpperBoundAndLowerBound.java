package serandsort;

import java.util.Scanner;

public class UpperBoundAndLowerBound {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int v1=upperBound(arr,target);
		int v2=lowerBound(arr,target);
		System.out.println(v2+" "+v1);
		int val=count(target,arr,v1,v2,n);// count no of occurances
		System.out.println(val);	
		}
	private static int lowerBound(int[] arr, int target) {
		 // lb is the point where arr[mid]>=target
		int ans=-1;
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>=target) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		} 
		return ans;
	}
	private static int upperBound(int[] arr, int target) {
		// ub is the point where arr[mid]>target	
		int ans=-1;
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]<=target) {
				lo=mid+1;
			}
			else {
				ans=mid;
				hi=mid-1;
			}
		}
		return ans;
	}
	private static int count(int x, int[] arr,int ub,int lb,int n) {
		if(lb==n)return 0;
		return ub-lb;
	}
}
