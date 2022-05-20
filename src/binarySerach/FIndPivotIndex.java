package binarySerach;

import java.util.Scanner;

public class FIndPivotIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int val=find(arr,target);
		System.out.println(val);

	}
	public static int find(int[]arr,int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[lo]<=arr[mid]) {
				if(target>=arr[lo] && target<arr[mid]) {
				 
					hi=mid-1;
				}else {
					lo=mid+1;
				}
			}
			else if(arr[mid]<=arr[hi]) {
				if(target>arr[mid] && target<=arr[hi]) {
				lo=mid+1;
				
			}else {
				hi=mid-1;
			}
		}
		
		}
		return -1;
	}
}
