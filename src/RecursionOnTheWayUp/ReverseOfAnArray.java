package RecursionOnTheWayUp;

import java.util.Scanner;

public class ReverseOfAnArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int  n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	reverse(0,arr);
	for(int val:arr) {
	System.out.println(val);
	}
	}
	public static void reverse(int i,int[]arr) {
		int n=arr.length;
		if(i>n/2) {
			return;
		}
		swap(i,n-i-1,arr);
		reverse(i+1,arr);
		
	}
	public static void swap(int i,int j,int[]arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
