//Given an array arr[] denoting heights 
//of N towers and a positive integer K, you 
//have to modify the height of each tower either by
//increasing or decreasing them by K only once. 
//After modifying, height should be a non-negative integer. 
//Find out what could be the possible minimum difference of
//the height of shortest and longest towers after you have modified each tower.


package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimiseDifferences {
	public static int getMinDiff(int[] arr, int n, int k) {
	      
	        int i=0;
	        int j=n-1;
	    int mid=(i+j)/2;
	    for(int l=0;l<=mid;l++){
	        arr[l]+=k;
	    }
	    for(int l=mid+1;l<n;l++){
	        if((arr[l]-k)>=0){
	        arr[l]-=k;
	    }
	        else{
	        	arr[l]+=k;
	        }
	        }
	        
	    
	    int val=arr[j]-arr[i];
	    return val;
	    
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				
			}
		int val=getMinDiff(arr,n,k);
		
		System.out.println(val);
		

	}

}
