package binarySerach;

import java.util.Scanner;

public class LOewrBound {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int val=binarySearchLB(arr,0,arr.length-1,key);
//		System.out.println(val);
		if(arr[val]!=key)System.out.println("Doesn't exist");
		
		int v=binarySearchUB(arr,0,arr.length-1,key);
//		System.out.println(v);
		System.out.println(v-val);
		
		
	}
	// lower bound index  (first element >=x)
	public static int binarySearchLB(int []arr,int l,int h,int key) {
		int ans=arr.length-1;
	 while(l<=h) {
		 int mid=(l+h)/2;
		 if(arr[mid]>=key) {
			 ans=mid;
			 h=mid-1;
		 }else {
			 l=mid+1;
		 }
	 }
	 return ans;
		
}
	// upper bound index  (first element > x)
	public static int binarySearchUB(int []arr,int l,int h,int key) {
		int ans=arr.length-1;
	 while(l<=h) {
		 int mid=(l+h)/2;
		 if(arr[mid]>key) {
			 ans=mid;
			 h=mid-1;
		 }else {
		l=mid+1;
		 }
	 }
	 return ans;
		
}
}