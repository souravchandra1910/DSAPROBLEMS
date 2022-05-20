package binarySerach;


import java.util.Scanner;

public class SEArchINDESsortedArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	int target=sc.nextInt();
	int i=0;
	int j=arr.length-1;
	while(i<=j) {
		int mid=(i+j)/2;
		if(arr[mid]==target) {
			System.out.println(mid);
			return;
		}else if(arr[mid]>target) {
			i=mid+1;
		}else {
			j=mid-1;
		}
	}
	System.out.println(-1);
	

	}

}
