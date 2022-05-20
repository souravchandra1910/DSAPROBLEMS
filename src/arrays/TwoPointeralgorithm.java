package arrays;

import java.util.*;

public class TwoPointeralgorithm {

	public static int isPairSum(int arr[], int N, int x) {
		Arrays.sort(arr);
		int i=0;
		int j=N-1;
		while(i<j) {
		if(arr[i]+arr[j]==x) {
			return 1;
		}
		else if(arr[i]+arr[j]<x) {
		i++;
		}
		else {
			j--;
		}
		}
		return 0;
		}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	
	int val=isPairSum(arr,arr.length,x);
	System.out.println(val);
	

	}

}
