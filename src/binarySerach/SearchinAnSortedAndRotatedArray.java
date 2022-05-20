package binarySerach;

import java.util.Scanner;

public class SearchinAnSortedAndRotatedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int val=advBinarySearch(arr,0,arr.length-1,key);
		System.out.println(val);
	}
	
	public static int advBinarySearch(int []arr,int l,int h,int key) {
	while(l<=h) {
		int mid=(l+h)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[l]<=arr[mid]) {
			//left wala part sorted hai
			if(key>=arr[l] && key<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}else {
			//right wala part sorted hai
			if(key>arr[mid] && key<=arr[h]) {
				l=mid+1;
				
			}else {
				h=mid-1;
			}
		}
		 
	}
	return -1;
	}

}
