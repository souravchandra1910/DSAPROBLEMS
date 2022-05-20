package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		 int val=duplicateNumber(arr);
		System.out.println(val);
		
		}
	
	
	
	private static int duplicateNumber(int[] arr) {
		   int idx=0;
		   while(idx<arr.length) {
			   if(arr[idx]!=idx+1) {
			   int correct=arr[idx];
			   if( arr[idx]!=arr[correct]) {
				   Swap(arr,idx,correct);
			   }
			   
			   else {
				   return arr[idx];
			   }
			   }
			   else {
				   idx++;
			   }
		   }
			return -1;
		}

		private static void Swap(int[] arr, int idx, int correct) {
			int temp=arr[idx];
			arr[idx]=arr[correct];
			arr[correct]=temp;
			
		}


	

}
