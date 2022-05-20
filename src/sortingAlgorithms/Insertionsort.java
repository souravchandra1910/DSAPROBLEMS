package sortingAlgorithms;

import java.util.Arrays;

public class Insertionsort {
public static void main(String[] args) {
	int []arr= {5,4,3,2,1};
	insertionSort(arr);
	System.out.println(Arrays.toString(arr));
   }

private static void insertionSort(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		int el=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>el) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=el;
	}
	
}
}
