package arrays;

import java.io.*;
import java.util.Scanner;
//import java.util.*;

public class Cyclicrotate2 {
	 public static void display(int[] a){
		    StringBuilder sb = new StringBuilder();

		    for(int val: a){
		      sb.append(val + " ");
		    }
		    System.out.println(sb);
		  }
		public static void reverse(int []a,int i,int j){
		    while(i<j){
		        int temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		        i++;
		        j--;
		    }
		}
		  public static void rotate(int[] a, int k){
		    k=k%a.length;
		    if(k<0){
		        k=k+a.length;
		        
		    }
		    reverse(a,0,a.length-1-k);// last se k bando to rotate karna hai
		    reverse(a,a.length-k,a.length-1);
		    reverse(a,0,a.length-1);
		    
		    
		  }

		  public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	    int k = sc.nextInt();

	    rotate(arr,k);
	    display(arr);
	 }


	}


