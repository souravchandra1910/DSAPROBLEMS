package arrays;

import java.util.Scanner;

public class ReverseanArray {
	public static void swap(int []arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
      swap(arr);
	}

}
