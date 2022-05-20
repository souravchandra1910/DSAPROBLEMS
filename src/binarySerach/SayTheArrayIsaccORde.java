package binarySerach;

import java.util.Scanner;

public class SayTheArrayIsaccORde {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		if(arr.length==1) {
			if(arr[0]==target) {
				System.out.println("found in the array in the index"+" = "+0);
			}else {
				System.out.println("Not found");
			}
		}else {
			if(arr[0]>arr[1]) {
				int val= BinarySearch2(arr,0,arr.length-1,target);
				System.out.println(val);
			}else {
				int val= BinarySearch1(arr,0,arr.length-1,target);
				System.out.println(val);
			}
		}


	}
	public static int BinarySearch1(int []arr,int l,int h,int key) {
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				
			return mid ;
			}else if(key<arr[mid]) {
				h=mid-1;
			}else if(key>arr[mid]) {
				l=mid+1;
			}
		}
		
	return -1;
		
		
	}
	public static int BinarySearch2(int []arr,int l,int h,int key) {
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				
			return mid ;
			}else if(key<arr[mid]) {
				l=mid+1;
			}else if(key>arr[mid]) {
				h=mid-1;
			}
		}
		
	return -1;
		
		
	}
	

}
