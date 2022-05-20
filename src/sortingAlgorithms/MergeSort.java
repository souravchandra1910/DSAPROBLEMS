package sortingAlgorithms;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
   int [] a=mergeSort(arr,0,arr.length-1);
    for(int val:a) {
    	System.out.print(val+" ");
    }
    System.out.println();
	
	}

	private static int[] mergeSort(int[] arr,int i,int j) {
		if(i==j) {
			int []a=new int[1];
			a[0]=arr[i];
			return a;
		}
		int mid=(i+j)/2;
		int []fsh=mergeSort(arr,i,mid);
		int []ssh=mergeSort(arr,mid+1,j);
		int []res=mergeTwoSortedArrays(fsh,ssh);
		return res;
	}

	private static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		   int []ans=new int[a.length+b.length];
		   int i=0,j=0,k=0;
		   while(i<a.length && j<b.length) {
			   if(a[i]<b[j]) {
				   ans[k]=a[i];
				   i++;
				   k++;
			   }
			   else {
				   ans[k]=b[j];
				   j++;
				   k++;
			   }
		   }
		   while(i<a.length) {
			   ans[k]=a[i];
			   i++;
			   k++;
		   }
		   while(j<b.length) {
			   ans[k]=b[j];
			   j++;
			   k++;
		   }
		   
			return ans;
		}

	}



