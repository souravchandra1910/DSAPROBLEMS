package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void cyclicSort(int[] arr) {
	   int idx=0;
	   while(idx<arr.length) {
		   int correct=arr[idx]-1;
		   if(arr[idx]!=arr[correct]) {
			   Swap(arr,idx,correct);
		   }
		   else {
			   idx++;
		   }
	   }
		
	}

	private static void Swap(int[] arr, int idx, int correct) {
		int temp=arr[idx];
		arr[idx]=arr[correct];
		arr[correct]=temp;
		
	}

}
