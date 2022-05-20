package arrays;

import java.util.*;
import java.util.Scanner;



public class AlterenateNegativeANDPositive {
	public static int [] sort(int []arr,int n) {
		//first step is to move all negative elements to the right and positive to the left
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]>0 && arr[j]>0) { 
			i++;
			}
			else if(arr[i]>0 && arr[j]<0) {
				j--;
			}else if(arr[i]<0 && arr[j]<0) {
				j--;
			}
			else if(arr[i]<0 && arr[j]>0) {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(i==0 || i==n) {// i agar last index pe hai to there doesn't exist any -ve nos 
			
			return arr;                  //&& i==0 that means positive no don't exist
		}
		
		else {
			int k=0;
			while(i<arr.length) {
				swap(arr,i,k);
				System.out.println(Arrays.toString(arr));
				i++;
				k=k+2;
			}
			return arr;
	}
	}
	public static void swap(int []arr,int i,int j) {

		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for( int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		}
		
		
		
		int []val=sort(arr,arr.length);
		for(int i=0;i<val.length;i++) {
			System.out.print(val[i]+" ");
		}
		
		
	}

}
