package binarySerach;

import java.util.Scanner;

public class FindMInimumElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();
  int []arr=new int[n];
  for(int i=0;i<arr.length;i++) {
	  arr[i]=sc.nextInt();
  }
  int val=find(arr);
System.out.println(val);
	}
public static int find(int []arr) { 
	int lo=0;
	int hi=arr.length-1;
	if(arr[lo]<=arr[hi]) {
		return arr[lo];
	}
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(arr[mid]>arr[mid+1]) {
			return arr[mid+1];
		}else if(arr[mid]<arr[mid-1]) {
			return arr[mid];
		}else if(arr[lo]<=arr[mid]) {
			lo=mid+1;
		}else if(arr[mid]<=arr[hi]) {
			hi=mid-1;
		}
	}
	return -1;
}
}
