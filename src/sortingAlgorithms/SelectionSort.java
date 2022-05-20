package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	  int []arr= {5,4,1,2,3};
	  selectionSort(arr);
	  System.out.println(Arrays.toString(arr));
	}

	//In Place sorting algorithm
	// best case complexity is O(N^2)
	// worst case complexity is O(N^2)
	// it an unstable sorting algorithm  
	
	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIdx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx=j;
				}
			}
			if(minIdx!=i)
			swap(arr,minIdx,i);
			
		}
		
	}

	private static void swap(int[] arr, int minIdx, int newIdx) {
		int temp=arr[minIdx];
		arr[minIdx]=arr[newIdx];
		arr[newIdx]=temp;
		
	}

	private static int findMin(int[] arr, int i, int length, int minIdx) {
		for(int j=i;j<=length;j++) {
			if(arr[j]<arr[minIdx]) {
				minIdx=j;
			}
		}
		return minIdx;
	}

}
