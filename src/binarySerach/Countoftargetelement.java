package binarySerach;

import java.util.Scanner;

public class Countoftargetelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int lo=0;
		int hi=arr.length-1;
		int fi=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(target==arr[mid]) {
				fi=mid;
				hi=mid-1;
				
			}else if(target >arr[mid]) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		
		
		lo=0;
		hi=arr.length-1;
		int li=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(target==arr[mid]) {
				li=mid;
				lo=mid+1;
				
			}else if(target >arr[mid]) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		int count =li-fi+1;
		System.out.println(count);

	}

}
