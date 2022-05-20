package binarySerach;

import java.util.Scanner;

public class BinarySearch_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
		int []arr= {10,20,30,40,50,80};
		
		int key=50;
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				System.out.println(mid);
			return ;
			}else if(key<arr[mid]) {
				h=mid-1;
			}else if(key>arr[mid]) {
				l=mid+1;
			}
		}
		
		System.out.println(-1);

	}

}
