package binarySerach;

import java.util.Scanner;

public class FindNoOfRotations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int val=mi(arr,0,arr.length-1);
		
	System.out.println(val);

	}
	
	
	 public static int mi(int []arr,int lo,int hi) {
		 if(arr[lo]<arr[hi]) {
			 return lo;
		 }
		 while(lo<=hi) {
		 int mid=(lo+hi)/2;
		 
		 int next=arr[(mid+1)%arr.length];
		 int prev=arr[(mid+(arr.length)-1)%arr.length];
		 if(arr[mid]<=next && arr[mid]<=prev) {
			 return mid;
		 }
		 else if(arr[mid]<=arr[lo]) {
			 hi=mid-1;
			 
		 }else if(arr[mid]>=arr[hi]) {
			 lo=mid+1;
		 }
		
		 
	 }
		return -1; 
	 }

}
