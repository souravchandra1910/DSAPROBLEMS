package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	
	  int []arr= {35,6,13,22,1};
	  bubbleSort(arr);
	  System.out.println(Arrays.toString(arr));

	}
	//the best case time complexity is O(N) -> when array is sorted already
	// the worst case time Complexity is O(N^2) -> when array is sorted in reverse order
	// the space complexity is constant O(1)
	//it is an inplace sorting algorithm
	// at the end of every pass the largest element is bubbled at the last position(largest index)
    // bubble sort is stable
	private static void bubbleSort(int[] arr) {
	//it is only needed to sort n-1 elements i.e if n-1 elements are in place
	// the nth element is automatically in its place
	for(int i=0;i<arr.length-1;i++) {//number of the passes will be taking place
		boolean swapped=false;
		// if no swapping is performed then its already sorted
		for(int j=1;j<arr.length-i;j++) {// number of comparisions are to be performed for every i
			if(arr[j]<arr[j-1]) {
				swapped=true;
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		if(swapped==false)
			break;
	}
	
		
	}

}
