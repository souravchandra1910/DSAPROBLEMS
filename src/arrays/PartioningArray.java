//partioning the array in smaller and larger halves

package arrays;

import java.util.Scanner;

public class PartioningArray {
public static void swap(int []arr,int i,int j) {

	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
	

}
public static void partion(int []arr,int pivot) {
	
	
	//i-end-->unknown
	//j-i-1-->  >=(greater than or equals to) elements
	//0-j-1-->  <(smaller)elements
	int i=0;
	int j=0;
	while(i<arr.length) {
		if(arr[i]>pivot) {
			i++;
			
		}
		else {
			swap(arr,i,j);
			i++;
			j++;
		}
	}
	
}


public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
int pivot=sc.nextInt();
partion(arr,pivot);
print(arr);
	}

}
