package serandsort;

import java.util.Scanner;

public class Count1sInASortedBinaryArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	int val=count(arr);
	System.out.println(val);

	}

	private static int count(int[] arr) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==0) {
				if(mid-1>0 && arr[mid-1]==1 || mid==0) {
					return mid;
				}
				else {
					hi=mid-1;
				}
			}
			else if(arr[mid]==1) {
				if(mid==arr.length-1 || arr[mid+1]==0) {
					return mid+1;
				}else {
					lo=mid+1;
				}
			}
		}
		return 0;
	}


}
