package binarySerach;

import java.util.*;

public class BSusingRecursion {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++)arr[i]=sc.nextInt();
	int x=sc.nextInt();
	int v=ub(x,arr);
	int u=lb(x,arr);
////	System.out.println(val);
	int a=count(x,arr,v,u,arr.length);
	System.out.println(a);
//	int sq=sqrtt(n);
//	System.out.println(sq);
//	int cq=cqrtt(n);
//	System.out.println(cq);
//	
		}

	private static int count(int x, int[] arr,int ub,int lb,int n) {
//		int li=-1,fi=-1;
//		int lo=0;
//		int hi=arr.length-1;
//		while(lo<=hi) {
//			int mid=(lo+hi)/2;
//			if(arr[mid]==x) {
//				fi=mid;
//				hi=mid-1;
//			}
//			else if(x>arr[mid]) {
//				lo=mid+1;
//			}
//			else {
//				hi=mid-1;
//			}
//		}
//			 lo=0;
//			 hi=arr.length-1;
//			while(lo<=hi) {
//				int mid=(lo+hi)/2;
//				if(arr[mid]==x) {
//					li=mid;
//					lo=mid+1;
//				}
//				else if(x>arr[mid]) {
//					lo=mid+1;
//				}
//				else {
//					hi=mid-1;
//				}
//		}
//		
//		return li-fi+1;
		if(arr[lb]==n)return 0;
		 return ub-lb;
	}

	private static int bsr(int[] arr, int low, int high, int x) {
		 if(high<low)return -1;
		 
		 int mid=(low+high)/2;
		 if(x==arr[mid])return mid;
		  if(x>arr[mid])return bsr(arr,mid+1,high,x);
		 return bsr(arr,low,mid-1,x);
		
	}
	
	public static int lb(int x,int []arr) {
		int lo=0;
		int ans=arr.length;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>=x) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	
	public static int ub(int x,int []arr) { 
		int lo=0;
		int ans=arr.length;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]<=x) {
			
				lo=mid+1;
			}
			else {
				ans=mid;
				hi=mid-1;
			}
		}
		return ans;
	}
	static int sqrtt(int n) {  //largerst value  mid * mid <= n 
		int lo=1,hi=n/2,ans=1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(mid * mid <=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	static int cqrtt(int n) {  //largerst value  mid * mid  * mid <= n 
		int lo=1,hi=n/2,ans=1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(mid * mid * mid <=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

}
