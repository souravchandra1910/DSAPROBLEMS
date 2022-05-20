package binarySerach;

import java.util.Scanner;

public class BinarySearch_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int val=binarySearch(arr,0,arr.length-1,key);
		System.out.println(val);
		
	}
	public static int binarySearch(int []arr,int l,int h,int key) {
		if(l>h) {
			return -1;
		}
		int mid=(l+h)/2;
		if(key==arr[mid]) {
			return arr[mid];
		}
		else if(key>arr[mid]) {
			int val=binarySearch(arr,mid+1,h,key);
			return val;
			
		}else if(key<arr[mid]) {
			int val=binarySearch(arr,l,mid-1,key);
			return val;
		}
		return -1;
		
		
	}

}
