package binarySerach;

import java.util.Arrays;
import java.util.Scanner;

public class SEARCHin2DMATRIX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int [][]arr= {
				{10,20,30,40},
				
				{15,25,35,45},
				
				{16,26,36,46},
				
				{17,27,37,47}
		};
		System.out.println(Arrays.toString(search(arr,370)));

	}
	public static int[]search(int[][]arr,int target){
		
	  int r=0,c=arr.length-1;
	  while(r<arr.length && c>=0) {
		  if(arr[r][c]==target) {
			  return new int[] {r,c};
		  
	  }
		  else if(arr[r][c]<target) {
		  r++;
	  }else {
		  c--;
	  }
	}
   return new int[] {-1,-1};
}
}
