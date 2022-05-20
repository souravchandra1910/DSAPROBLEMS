package arrays;

import java.util.Scanner;

public class QuickSelect {
public static int quickSelect(int []arr,int lo,int h,int k) {
int pivot=arr[h];
int pi=partition(arr,lo,h,pivot);
if(k>pi) {
	return quickSelect(arr,pi+1,h,k);
	
}else if(k<pi) {
	return quickSelect(arr,lo,pi-1,k);
}
else {
	return arr[pi];
}
	
	
	
	
}
public static void swap(int []arr,int i,int j) {

	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
	

}
public static int partition(int []arr,int lo,int hi,int pivot) {
	int i=lo;
	int j=lo;
	while(i<=hi) {
		if(arr[i]>pivot) {
			i++;
		}else {
			swap(arr,i,j);
			i++;
			j++;
		}
	}
	return j-1;
}
public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int []arr=new int [n];
	for( int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	
	int val=quickSelect(arr,0,arr.length-1,k-1);
	
	System.out.println(val);
	}

}
